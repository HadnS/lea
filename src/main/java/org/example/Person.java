package org.example;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 007
 * @Date: 2019/1/27/0027 10:20
 * @Version 1.0
 * @Description: 创建测试用的bean
 */

public class Person {
    private String name;        //姓名
    private int age;            //年龄
    private  Fruit fruit;

    public Person() {
        System.out.println("person无参构造函数");
    }

    public void setFruit(Fruit fruit) {
        this.fruit=fruit;
    }
    public Person(String name, int age,Fruit fruit) {
        this.name = name;
        this.age = age;
        this.fruit=fruit;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +'\''+
                ", fruit="+fruit+

                '}';
    }



}