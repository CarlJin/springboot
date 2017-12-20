package com.wss.controller;

import com.wss.util.GirlProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2017-12-20 下午3:54
 **/
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${girl.name}")
     private String name;
    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String hello() {
         logger.info(name);
        logger.info(girlProperties.toString());
        return "hello";
    }

}
