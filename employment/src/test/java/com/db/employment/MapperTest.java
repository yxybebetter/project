package com.db.employment;

import com.db.employment.pojo.Recruit;
import com.db.employment.pojo.UserParam;
import com.db.employment.service.RecruitService;
import com.db.employment.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {

    @Autowired
    UserService userService;
    @Autowired
    RecruitService recruitService;

    @Test
    public void testUser(){
        UserParam userParam = new UserParam();
        userParam.setUsername("admin1");
        userParam.setPassword("admin123");
        System.out.println(userService.getUser(userParam));
    }

    @Test
    public void testRecruit(){
        List<Recruit> allByPage = recruitService.getAllByPage(1, 10,1);
        for(Recruit recruit : allByPage){
            System.out.println(recruit.getRjob());
        }
    }

    @Test
    public void test(){
        List<Recruit> recruits = recruitService.getRecruitByname("蓝月亮", 1, 5);
        for(Recruit recruit : recruits){
            System.out.println(recruit.getRjob());
        }

    }
}
