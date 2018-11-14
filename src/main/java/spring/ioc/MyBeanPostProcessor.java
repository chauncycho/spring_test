package spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("第五步：初始化方法前……");
        return o;
    }

    public Object postProcessAfterInitialization(final Object bean, String s) throws BeansException {
        System.out.println("第八步：初始化后方法……");
//        if("food".equals(s)) {
//            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
//                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                    System.out.println("方法增强");
//                    return method.invoke(bean, args);
//                }
//            });
//            return proxy;
//        }else{
            return bean;
//        }
    }
}
