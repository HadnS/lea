import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;

public class myTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello test = (Hello) context.getBean("test");
        System.out.println(test);


    }
}
