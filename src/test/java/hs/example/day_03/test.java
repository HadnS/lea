package hs.example.day_03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopbens.xml");
        UserService userService = context.getBean("UserService",UserService.class);
        userService.add();

    }
}
