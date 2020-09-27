package hs.example.day_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopdiybeans.xml");
        UserService one = context.getBean("UserService", UserService.class);
        one.add();

    }
}
