package hs.example.day_01;

import hs.example.day_02.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，接口写成通用
 */
public class ProxyInvokationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setObject(Object target) {
        this.target = target;
    }

    //创建代理对象，第二个参数，代理类的一个接口
    public Object getProxy(){
       return  Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this   );
    }


    //处理代理实例
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //使用反射机制实现

        Object result = method.invoke(target, args);
        return result;
    }


}
