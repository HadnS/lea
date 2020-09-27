package hs.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class animalPrint {

@Resource(name="cat")
    animal one;
  public animalPrint(){
      System.out.println("animalPrint无参构造函数");
  }
    public void setCat(animal one) {
        this.one = one;
    }

    public void getOne() {
        one.getName();
    }
}
