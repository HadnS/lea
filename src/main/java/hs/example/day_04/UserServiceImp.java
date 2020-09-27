package hs.example.day_04;



/**
 * day_03是使用spring的api实现代理
 * 这是使用自定义切面实现
 */
public class UserServiceImp implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}