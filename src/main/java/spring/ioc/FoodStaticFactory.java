package spring.ioc;

public class FoodStaticFactory {
    public static Food getFood(){
        System.out.println("通过静态工厂实例对象");
        return new Food();
    }
}
