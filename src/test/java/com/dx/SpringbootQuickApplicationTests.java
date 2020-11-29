package com.dx;

import com.dx.pojo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootQuickApplicationTests {

    @Autowired
    Person person;

    @Test
    public void test(){
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
