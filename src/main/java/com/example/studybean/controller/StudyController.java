package com.example.studybean.controller;

import com.example.studybean.DTO.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class StudyController {

    @RequestMapping(value = "/say" ,method = RequestMethod.POST)
    @ResponseBody
    public User study(@RequestBody User user){
        log.info(user.getUserName());
        return user;
    }


}
