package hs.example.day_04;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DiyPointCut {


    @Before("execution(* hs.example.day_04.UserServiceImp.*(..))")
    public void method_befor(){
        System.out.println("方法执行前");
    }
    @After("execution(* hs.example.day_04.UserServiceImp.*(..))")
    public void method_after(){
        System.out.println("方法执行后");
    }
//    @Around("execution(* hs.example.day_04.UserServiceImp.*(..))")
//    public void method_around(){
//        System.out.println("方法执行环绕");
//    }
}
