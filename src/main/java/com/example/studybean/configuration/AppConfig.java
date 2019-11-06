package com.example.studybean.configuration;

import com.example.studybean.DTO.User;
import com.example.studybean.service.TestServiceImpl;
import com.example.studybean.service.TsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.studybean.*")
public class AppConfig {
//    @Bean("user")
//    public User initUser () {
//        User user = new User();
//        user.setId(1L);
//        user.setUserName("user_name");
//        user.setNote("note_l");
//        return user;
//    }
//
//    @Bean("TestServiceImpl")
//    public TestServiceImpl initTestServiceImpl(){
//
//        return new TestServiceImpl();
//    }

//    @Bean("TsServiceImpl")
//    public TsServiceImpl initTsServiceImpl(){
//
//        return new TsServiceImpl();
//    }
}
