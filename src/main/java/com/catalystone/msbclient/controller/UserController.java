package com.catalystone.msbclient.controller;

import com.catalystone.msbclient.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserService uService;

    @RequestMapping(value="/getTheaters", method = RequestMethod.GET)
    public String getTheater(ModelMap model) {
        log.info("into the controller");
        model.put("theaterList", uService.getTheaters());
        return "theater";

    }

}
