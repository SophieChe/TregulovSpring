package springIntroduction;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("class Dog: init method");
//    }
//
//    @PreDestroy
//    protected void destroy() {
//        System.out.println("class Dog: destroy method");
//    }
}
