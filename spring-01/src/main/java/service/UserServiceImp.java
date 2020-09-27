package service;

import dao.User;
import dao.UserImp;
import dao.UserMysqlImp;

public class UserServiceImp implements UserService{
    private User userdao;
    //private User userdao= new UserMysqlImp();



    @Override
    public void setUser(User user) {
        this.userdao=user;
    }

    @Override
    public void getUser() {
         userdao.getUser();
    }
}
