package hs.example.day_02;

public class  Client {
    public static void main(String[] args) {
        //真实角色-->房东 host
        Host host = new Host();

        //代理类
        ProxyInvokationHandler proxy = new ProxyInvokationHandler();
        proxy.setRent(host);
        Rent obj =(Rent) proxy.getProxy();
        obj.rent();


    }
}
