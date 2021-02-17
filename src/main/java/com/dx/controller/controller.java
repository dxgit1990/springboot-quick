package com.dx.controller;

import com.dx.pojo.Person;
import com.dx.pojo.User;
import com.dx.pojo.UserItcode;
import com.dx.util.BeanCopierUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
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
    public String hello() {
        logger.info("this is a logger ");
        logger.info("person.map:{}", person.getMap());
        logger.info("url.addr ... {}", addr);
        return "hello," + name + "!";
    }


    @GetMapping("/download")
    public void download(HttpServletResponse response) throws Exception {
        File file = new File("D:\\我的文件\\Netty实战.pdf");
        FileInputStream fis = new FileInputStream(file);
        String name = file.getName();

        ServletOutputStream outputStream = response.getOutputStream();

        response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode(name, "utf-8"));
        IOUtils.copy(fis, outputStream);

        IOUtils.closeQuietly(fis);
        IOUtils.closeQuietly(outputStream);

    }

    @GetMapping("/copy")
    public void testBeanCopier() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(16);
        user.setPassword("45678");
        user.setAddress("tj");
        UserItcode itcode = new UserItcode();
        BeanCopierUtil.copy(user, itcode);
        System.out.println(itcode);

    }
}
