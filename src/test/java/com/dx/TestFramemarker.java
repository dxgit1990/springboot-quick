package com.dx;

import com.dx.pojo.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dx
 * @create 2020/12/1 21:58
 * @for new
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFramemarker {
    private static final String CLASS_PATH = "D:\\";
    @Test
    public void test(){
        Configuration Configuration =new Configuration();
        Writer out=null;
        try {

            Configuration.setDirectoryForTemplateLoading(new File("E:\\ideaSpace\\springboot-quick\\src\\main\\resources\\templates"));
            List<String> fieldList = new ArrayList<>();
            fieldList.add("用户名");
            fieldList.add("密码");
            fieldList.add("年龄");
            fieldList.add("地址");

            Map<String, Object> dataMap = new HashMap<String, Object>();
            List<User> list = new ArrayList<>();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                User user = new User();
                builder.append("test").append(i).append("afadfwerwerqwerqwerqwerqwerqwerqwerqwer");
                user.setUsername(builder.toString());
                user.setAddress("bjbjbjbjbjbjbjbj"+i);
                user.setPassword("pwdpwdpwdpwdpwdpwdpwdpwd"+i);
                user.setAge(17+i);
                list.add(user);
                builder.setLength(0);
            }
            dataMap.put("list",list);
            dataMap.put("fields",fieldList);


            Template template = Configuration.getTemplate("test.ftl");
            File docFile = new File(CLASS_PATH + File.separator + "user.html");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            template.process(dataMap, out);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        System.out.println("ok_____________");
    }

}
