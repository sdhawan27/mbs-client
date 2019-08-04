package com.catalystone.msbclient.controller;

import com.catalystone.msbclient.exception.UserNotFoundException;
import com.catalystone.msbclient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired
    LoginService service;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/validateUser", method = RequestMethod.POST)
    public String showLoginPage(ModelMap model, @RequestParam String name, @RequestParam String password)
            throws UserNotFoundException {

        model.put("name", name);
        model.put("password", password);

        return service.getUserView(name, password);

    }
}
