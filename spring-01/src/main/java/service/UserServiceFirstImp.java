package service;

import dao.User;

public class UserServiceFirstImp implements UserServiceFirst{
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void getUser() {
        user.getUser();
    }
}
