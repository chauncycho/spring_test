package spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCircleTest implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean{
    private String name;

    public LifeCircleTest(){
        System.out.println("第一步：构造方法，实例化");
    }

    public void setName(String name){
        this.name = name;
        System.out.println("第二步：设置属性");
    }

    public void setUp(){
        System.out.println("第七步：执行指定初始化方法");
    }

    public void teardown(){
        System.out.println("第十一步：执行指定销毁方法");
    }

    public void run(){
        System.out.println("第九步：执行自身方法");
    }


    public void setBeanName(String s) {
//      名称就是Bean的id
        System.out.println("第三步：设置Bean的名称："+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂信息");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后");
    }

    public void destroy() throws Exception {
        System.out.println("第十步：执行Spring销毁方法");
    }
}
