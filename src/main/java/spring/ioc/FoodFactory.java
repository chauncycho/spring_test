package spring.ioc;

public class FoodFactory {
    public Food getFood(){
        System.out.println("通过实例工厂实例对象");
        return new Food();
    }
}
