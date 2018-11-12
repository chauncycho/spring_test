
Spring IOC

IOC ：Inverse-of-control  控制反转
反转的概念就是将原本在程序中手动创建实体对象的控制权，交给Spring框架管理

原理：配置+反射+工厂

通过配置，把实体class的位置写入配置文件，Spring框架便可以通过反射并通过工厂创建实体类

DI：Dependency-injection  依赖注入
依赖注入的概念，就是在Spring创建这个对象的过程中，将这个对象所依赖的属性给注入进去

简单流程
1.引入jar包


2.创建实体类，这里我创建的是Food类，为属性添加setter
3.在src/main/resource中添加applicationContext.xml配置文件


4.通过下面的代码便可通过Spring得到一个实体对象
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
Food food = (Food) applicationContext.getBean("food");
Spring实例对象的三种方法
1.通过构造方法实例对象
如上简单流程

2.通过静态工厂实例对象
工厂类：
public class FoodStaticFactory {
    public static Food getFood(){
        System.out.println("通过静态工厂实例对象");
        return new Food();
    }
}
配置：
<!-- 通过静态工厂实例对象 -->
<bean id="food2" class="spring.ioc.FoodStaticFactory" factory-method="getFood"/>
实例：
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
Food food = (Food) applicationContext.getBean("food2");
3.通过实例工厂实例对象
工厂类：
public class FoodFactory {
    public Food getFood(){
        System.out.println("通过实例工厂实例对象");
        return new Food();
    }
}
配置：
<bean id="foodFactory" class="spring.ioc.FoodFactory"/>
<bean id="food3" factory-bean="foodFactory" factory-method="getFood"/>
实例：
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
Food food = (Food) applicationContext.getBean("food3");
