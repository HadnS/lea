import dao.UserMysqlImp;
import service.UserServiceFirstImp;
/*
注释

*/
public class myTestFirst {
    public static void main(String[] args) {
        UserServiceFirstImp test  = new UserServiceFirstImp();
        test.setUser(new UserMysqlImp());
        test.getUser();
    }
}
