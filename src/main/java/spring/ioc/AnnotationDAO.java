package spring.ioc;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("annotationDAO")
public class AnnotationDAO {
    public void save(){
        System.out.println("annotationDAO -> save");
    }

    @PostConstruct
    public void init(){
        System.out.println("DAO初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DAO销毁");
    }


}
