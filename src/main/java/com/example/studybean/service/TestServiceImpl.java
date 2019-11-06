package com.example.studybean.service;

import com.example.studybean.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
    @Override
    public String test(){
        String b = "TestServiceImpl";
        log.info(b);
       return b ;
    }
}
