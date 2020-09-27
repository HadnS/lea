package hs.example.day_01;

import java.lang.reflect.Proxy;

/**
 * 静态代理类,不需要修改UserServiceImp类的代码
 */
public class UserServiceProxy implements UserService{
    private UserServiceImp userservice;
    public UserServiceProxy(UserServiceImp abc){
        userservice=abc;

    }
    @Override
    public void add() {
        log("add");
        userservice.add();
    }

    @Override
    public void delete() {
        log("delete");
        userservice.delete();
    }

    @Override
    public void update() {
        log("update");
        userservice.update();

    }

    @Override
    public void query() {
        log("query");
        userservice.query();

    }
    public void log(String msg){
        System.out.println("调用了"+msg);
    }
}
