package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
<<<<<<< HEAD
 * Created by Hi on 26-12-2017.
=======
 * Created by Hi on 04-02-2018.
>>>>>>> payload
 */
@Controller
public class PayloadController {

<<<<<<< HEAD
    public static  final String PAYLOAD_VIEW_NAME = "payload/payload";

    @RequestMapping("/payload")
    public String payload() {
        return  PAYLOAD_VIEW_NAME;
=======
    public static final String PAYLOAD_VIEW_NAME = "payload/payload";

    @RequestMapping("/payload")
    public  String payload() {
        return PAYLOAD_VIEW_NAME;
>>>>>>> payload
    }
}
