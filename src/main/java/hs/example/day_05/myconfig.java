package hs.example.day_05;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hs.example.day_05")
public class myconfig {
    //得到一个UserBean,所以返回值类型是User

    public User getUser()
    {
        return new User();
    }
}
