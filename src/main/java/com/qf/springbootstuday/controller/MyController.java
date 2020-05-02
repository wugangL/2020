package com.qf.springbootstuday.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: 吴
 * @Date: 2020/4/30 14:56
 */
@Controller
public class MyController {
    @Value("${image.path}")
    private String IMAGE_PATH;

    private Logger logger= LoggerFactory.getLogger(MyController.class);
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello 2020 please hond on!";
    }
    @RequestMapping("date")
    @ResponseBody
    public Date getDate(Date date){

        System.out.println(date);
        System.out.println("IMAGE PATH IS ..."+IMAGE_PATH);
        logger.debug("debug..");
        logger.info("info..");
        logger.warn("warn..");
        logger.error("error..");
        return  date;

    }
}
