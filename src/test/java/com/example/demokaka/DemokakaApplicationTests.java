package com.example.demokaka;

import com.example.demokaka.mapper.RegulationMapper;
import com.example.demokaka.model.Regulation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.example.demokaka.Utils.InDb.getAllFileName;
import static com.example.demokaka.Utils.InDb.readFile;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.example.demokaka.mapper")
public class DemokakaApplicationTests {
	@Resource
	RegulationMapper regulationMapper;

	@Test
	public void contextLoads() {
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
	}

}
