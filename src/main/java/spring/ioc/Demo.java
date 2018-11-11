package spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    /**
     * 通过spring生成实体测试
     * 通过构造方法
     */
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food");
        System.out.println(food);
    }

    /**
     * 通过静态工厂
     */
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food2");
    }

    /**
     * 通过实例工厂
     */
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food3");
    }
}
