package com.example.demokaka.controller;

import com.example.demokaka.mapper.RegulationMapper;
import com.example.demokaka.model.Regulation;
import com.example.demokaka.model.RegulationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.example.demokaka.Utils.InDb.getAllFileName;
import static com.example.demokaka.Utils.InDb.readFile;

@RestController
public class InDbController {
    @Resource
    RegulationMapper regulationMapper;//用来连接数据库的变量的定义

    @RequestMapping("/indb")
    public String InDb() {
        regulationMapper.deleteByExample(new RegulationExample());//调用删除函数清regulation表
        System.out.println("===>Regulation清空");
        ArrayList<String> allFileName = getAllFileName("src\\main\\resources\\docs\\");
        for (String name : allFileName) {
            System.out.println(name);
            List<String> strings = readFile(name);
            Regulation regulation = new Regulation();
            regulation.setRegulationTitle(strings.get(0));
            regulation.setPublishTime(strings.get(1));
            regulation.setPublisher(strings.get(2));
            regulation.setByMeeting(strings.get(3));
            regulation.setMainBody(strings.get(4));
            regulationMapper.insert(regulation);
        }

        return "入库成功，共入库"+allFileName.size()+"个文件。";
    }
}
