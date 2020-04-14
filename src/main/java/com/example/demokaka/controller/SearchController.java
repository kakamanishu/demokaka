package com.example.demokaka.controller;

import com.example.demokaka.mapper.RegulationMapper;
import com.example.demokaka.model.Regulation;
import com.example.demokaka.model.RegulationExample;
import org.hibernate.validator.constraints.EAN;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SearchController {

    @Resource
    RegulationMapper regulationMapper;

    @RequestMapping("/searchByTitle")
    public List<Regulation> searchByTitle(String keyword){
        RegulationExample regulationExample = new RegulationExample();
        RegulationExample.Criteria criteria = regulationExample.createCriteria();
        criteria.andRegulationTitleLike("%"+keyword+"%");

        //开始查询数据库
        List<Regulation> regulations = regulationMapper.selectByExample(regulationExample);

        //返回形成restfulApi数据
        return regulations;
    }


    @RequestMapping("/searchByTime")
    public List<Regulation> searchByTime(String keyword){
        RegulationExample regulationExample = new RegulationExample();
        RegulationExample.Criteria criteria = regulationExample.createCriteria();
        criteria.andPublishTimeLike("%"+keyword+"%");

        //开始查询数据库
        List<Regulation> regulations = regulationMapper.selectByExample(regulationExample);

        //返回形成restfulApi数据
        return regulations;
    }

    @RequestMapping("/searchByPublisher")
    public List<Regulation> searchByPublisher(String keyword){
        RegulationExample regulationExample = new RegulationExample();
        RegulationExample.Criteria criteria = regulationExample.createCriteria();
        criteria.andPublisherLike("%"+keyword+"%");

        //开始查询数据库
        List<Regulation> regulations = regulationMapper.selectByExample(regulationExample);

        //返回形成restfulApi数据
        return regulations;
    }

    @RequestMapping("/searchByMeeting")
    public List<Regulation> searchByMeeting(String keyword){
        RegulationExample regulationExample = new RegulationExample();
        RegulationExample.Criteria criteria = regulationExample.createCriteria();
        criteria.andByMeetingLike("%"+keyword+"%");

        //开始查询数据库
        List<Regulation> regulations = regulationMapper.selectByExample(regulationExample);

        //返回形成restfulApi数据
        return regulations;
    }
}
