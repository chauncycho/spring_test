package spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    /**
     * 通过spring生成实体测试
     * 通过构造方法
     */
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food");
        System.out.println(food);
    }

    /**
     * 通过静态工厂
     */
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food2");
    }

    /**
     * 通过实例工厂
     */
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food3");
    }

    /**
     * bean的作用范围测试
     * singleton 单例，每次创建都返回同一个实例
     * prototype 每次创建都返回一个新的实例
     */
    public void demo4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food)applicationContext.getBean("food");
        Food food1 = (Food)applicationContext.getBean("food");
        Food food2 = (Food)applicationContext.getBean("food");
        System.out.println("food:"+food.hashCode()+"  food1:"+food1.hashCode()+"  food2:"+food2.hashCode());

        FoodFactory foodFactory = (FoodFactory)applicationContext.getBean("foodFactory");
        FoodFactory foodFactory1 = (FoodFactory)applicationContext.getBean("foodFactory");
        FoodFactory foodFactory2 = (FoodFactory)applicationContext.getBean("foodFactory");
        System.out.println("foodFactory:"+foodFactory.hashCode()+"  foodFactory1:"+foodFactory1.hashCode()+"  foodFactory2:"+foodFactory2.hashCode());

    }

    /**
     * Bean的生命周期测试
     */
    @Test
    public void demo5(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeCircleTest lct = (LifeCircleTest) applicationContext.getBean("lifeCircleTest");
        lct.run();
        applicationContext.close();
    }
}
