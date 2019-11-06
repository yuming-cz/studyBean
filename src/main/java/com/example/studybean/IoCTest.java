package com.example.studybean;

import com.example.studybean.DTO.User;
import com.example.studybean.configuration.AppConfig;
import com.example.studybean.service.TestService;
import com.example.studybean.service.TestServiceImpl;
import com.example.studybean.service.TsServiceImpl;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
public class IoCTest {

//    public void setTsServiceImpl(TsServiceImpl tsServiceImpl) {
//        this.tsServiceImpl = tsServiceImpl;
//    }

//    @Autowired
//    private static TsServiceImpl tsServiceImpl = null;

   // private static final Logger LOG = LoggerFactory.getLogger(IoCTest.class);
    public  static void main (String [] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user =    (User)ctx.getBean("user");
//        TestServiceImpl user = ctx.getBean(TestServiceImpl.class);
//        LOG.debug(user.getUserName());
        TestService test = (TestServiceImpl) ctx.getBean("testServiceImpl");
        log.debug(test.test());
        TsServiceImpl tsServiceImpl = new TsServiceImpl();
        log.info(tsServiceImpl.test());
    }
}
