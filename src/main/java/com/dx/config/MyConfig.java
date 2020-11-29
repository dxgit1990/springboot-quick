package com.dx.config;

import com.dx.pojo.Person;
import com.dx.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dengx
 * @date 2020/3/24-17:33
 * @for create new 配置类
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
