package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hi on 25-12-2017.
 */
@Controller
public class LoginController {

    /** The login view name */
    private static final String LOGIN_VIEW_NAME = "user/login";


    @RequestMapping("/login")
    public String login() {
        return  LOGIN_VIEW_NAME;
    }
}
