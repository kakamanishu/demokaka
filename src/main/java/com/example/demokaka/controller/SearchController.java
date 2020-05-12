package com.example.demokaka.controller;

import com.example.demokaka.mapper.RegulationMapper;
import com.example.demokaka.model.Regulation;
import com.example.demokaka.model.RegulationExample;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    public static final int pageSize = 15;

    @Resource
    RegulationMapper regulationMapper;

    @RequestMapping("/search")
    public String search(String kind, String keyword, Model model,Integer current) {

        double upTime;//方法的执行时间(秒)
        long startTime = System.currentTimeMillis(); //获取开始时间
        RegulationExample regulationExample = new RegulationExample();
        switch (kind) {
            case "全文":
                regulationExample.or().andRegulationTitleLike('%'+keyword+'%');
                regulationExample.or().andByMeetingLike('%'+keyword+'%');
                regulationExample.or().andPublishTimeLike('%'+keyword+'%');
                regulationExample.or().andPublisherLike('%'+keyword+'%');
                regulationExample.or().andMainBodyLike('%'+keyword+'%');
                break;
            case "标题":
                regulationExample.or().andRegulationTitleLike('%'+keyword+'%');
                break;
            case "颁布会议":
                regulationExample.or().andByMeetingLike('%'+keyword+'%');
                break;
            case "颁布时间":
                regulationExample.or().andPublishTimeLike('%'+keyword+'%');
                break;
            case "颁布人":
                regulationExample.or().andPublisherLike('%'+keyword+'%');
                break;
            case "正文":
                regulationExample.or().andMainBodyLike('%'+keyword+'%');
                break;
        }
        if (current == null)
            current = 1;
        long l = regulationMapper.countByExample(regulationExample);
        regulationExample.setOrderByClause("Regulation_id limit "+pageSize*(current-1)+", "+pageSize);
        //开始查询数据库
        List<Regulation> regulations = regulationMapper.selectByExample(regulationExample);
        for (Regulation regulation : regulations) {
            String format = "<a class=\"btn-small btn-round\">"+keyword+"</a>";
            switch (kind) {
                case "全文":
                    regulation.setPublisher(regulation.getPublisher().replace(keyword, format));
                    regulation.setMainBody(regulation.getMainBody().replace(keyword, format));
                    regulation.setPublishTime(regulation.getPublishTime().replace(keyword, format));
                    regulation.setByMeeting(regulation.getByMeeting().replace(keyword, format));
                    regulation.setRegulationTitle(regulation.getRegulationTitle().replace(keyword, format));
                    break;
                case "标题":
                    regulation.setRegulationTitle(regulation.getRegulationTitle().replace(keyword, format));
                    break;
                case "颁布会议":
                    regulation.setByMeeting(regulation.getByMeeting().replace(keyword, format));
                    break;
                case "颁布时间":
                    regulation.setPublishTime(regulation.getPublishTime().replace(keyword, format));
                    break;
                case "颁布人":
                    regulation.setPublisher(regulation.getPublisher().replace(keyword, format));
                    break;
                case "正文":
                    regulation.setMainBody(regulation.getMainBody().replace(keyword, format));
                    break;
            }
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        upTime = new BigDecimal(endTime - startTime).divide(new BigDecimal(1000)).doubleValue();//耗时(秒)
        System.out.println(regulations.size());
        ArrayList<String> pages = new ArrayList<>();
        for (int i = 0; i < l/pageSize; i++) {
            pages.add("/search?kind="+kind+"&keyword="+keyword+"&current="+(i+1));
            System.out.println("/search?kind="+kind+"&keyword="+keyword+"&current="+(i+1));
        }
        //将数据加入model
        model.addAttribute("kind", kind);
        model.addAttribute("keyword", keyword);
        model.addAttribute("regulations", regulations);
        model.addAttribute("upTime", upTime);
        model.addAttribute("pages",pages);
        model.addAttribute("current",current);
        //返回形成restfulApi数据
        return "searchResult";
    }

}
