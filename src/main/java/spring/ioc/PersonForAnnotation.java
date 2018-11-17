package spring.ioc;

import org.springframework.stereotype.Component;

/**
 * 通过注解实现Bean管理测试类
 */
@Component("personForAnnotation")
public class PersonForAnnotation {
    public void say(){
        System.out.println("通过注解实现Bean管理");
    }
}
