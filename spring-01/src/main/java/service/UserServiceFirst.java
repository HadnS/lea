/*
UserService接口中提供了setUser方法，而所看视频中是在接口的实现类中添加了set方法
这里也实尝试现,因为在接口的实现类中实现了set方法，所以在test中类型需要未UserServiceImp即实现类
如果实在接口中提供了set方法，则类型为接口或者实现类都可以
 */
package service;

public interface UserServiceFirst {
    public void getUser();
}
