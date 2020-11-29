package com.dx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author dengx
 * @date 2020/3/24-16:34
 * @for create new
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {


    private static final long serialVersionUID = -5115872069015738010L;

    private String name;
    private int age;
    private Date birthday;

    private Map<String,String> map;

    public Person() {
    }

    public Person(String name, int age, Date birthday, Map<String, String> map) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", map=" + map +
                '}';
    }
}
