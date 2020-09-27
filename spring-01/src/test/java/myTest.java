/*
*控制反转，若想创建dao层的多个种类的实现，需要在service层更改User的赋值，
* 但是通过userService的set()方法注入，实现了在myTest文件里就可以更改想创建的dao层的实现类型，
* 将这一需求交给了客户
* 视频中是将setUser()方法写在接口的实现类UserServiceImp中，这个程序是写在接口中
 */

import dao.UserMysqlImp;
import dao.UserOracleImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImp;
import dao.UserOracleImp;
public class myTest {
    public static void main(String[] args) {
//        UserServiceImp test = new UserServiceImp();
//        test.setUser(new UserMysqlImp());
//        test.getUser();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserOracleImp test = (UserOracleImp)context.getBean("test");
        UserMysqlImp test1 = (UserMysqlImp) context.getBean("test1");
        test.getUser();
        test1.getUser();
    }
}
