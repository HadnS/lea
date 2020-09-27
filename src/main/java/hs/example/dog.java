package hs.example;

public class dog implements animal{
    public dog(){
        System.out.println("dog无参构造函数");
    }

    @Override
    public void getName() {
        System.out.println("这是狗");
    }
}
