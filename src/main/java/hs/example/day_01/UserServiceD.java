package hs.example.day_01;

/**
 * 动态穿创建代理类
 */
public class UserServiceD {
    public static void main(String[] args) {
        //真实角色
        UserServiceImp userserviceimp = new UserServiceImp();


        //代理
        ProxyInvokationHandler proxy = new ProxyInvokationHandler();
        proxy.setObject(userserviceimp);
        UserService obj =(UserService) proxy.getProxy();
        obj.add();
        obj.delete();
        obj.query();
        obj.update();



    }
}
