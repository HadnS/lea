package hs.example.day_01;

public class test {
    public static void main(String[] args) {
        UserServiceImp abc = new UserServiceImp();
        UserServiceProxy one = new UserServiceProxy(abc);
        one.add();
        one.delete();
        one.query();
        one.update();
    }
}
