package com.example.studybean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("test")
public class TsServiceImpl  implements TestService  {


        private static final Logger log = LoggerFactory.getLogger(TsServiceImpl.class);
        @Override
        public String test(){
            String a = "TsServiceImpl";
            log.info(a);
            return a;


        }
}
