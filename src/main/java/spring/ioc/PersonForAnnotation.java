package spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 通过注解实现Bean管理测试类
 */
@Component("personForAnnotation")
@Scope("prototype")
public class PersonForAnnotation {

    @Value("米饭")
    private String something;

    @Autowired
    private AnnotationDAO annotationDAO;

    public void say(){
        System.out.println("通过注解实现Bean管理");
    }

    public void eat(){
        System.out.println("吃"+something);
    }

    public void save(){
        annotationDAO.save();
    }

    public AnnotationDAO getAnnotationDAO() {
        return annotationDAO;
    }
}
