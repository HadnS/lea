package hs.example.day_05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myconfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());

    }
}
