package org.example;

import hs.example.animalPrint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("Person1");
        System.out.println(person);
//        Person personT = (Person) context.getBean("Person1");
//        System.out.println(person==personT);
//
//        Person one = (Person) context.getBean("Person1");
//        System.out.println("person = " + one);
//        animalPrint ani =(animalPrint) context.getBean("animalPrint");
//       ani.getOne();


//        System.out.println( "Hello World!" );
    }
}
