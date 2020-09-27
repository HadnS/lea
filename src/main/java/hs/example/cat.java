package hs.example;

import org.springframework.stereotype.Component;

    @Component
    public class cat implements animal {
        public cat(){
            System.out.println("cat无参构造函数");
        }
        @Override
        public void getName() {
            System.out.println("这是猫 ");
        }
    }



