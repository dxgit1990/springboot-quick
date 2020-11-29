package com.dx.controller;

import com.dx.pojo.Person;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author dengx
 * @date 2020/3/24-16:22
 * @for create new
 */
@RestController
public class controller {

    private static Logger logger = LoggerFactory.getLogger(controller.class);
    @Value("lucy")
    private String name;

    @Autowired
    private Person person;

    @Value("${url.addr}")
    private String addr;

    @RequestMapping("/hello")
    public String hello(){
        logger.info("this is a logger ");
        logger.info("person.map:{}",person.getMap());
        logger.info("url.addr ... {}",addr);
        return "hello,"+name+"!";
    }
}
