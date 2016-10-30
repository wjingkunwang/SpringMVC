package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wjk on 16/10/27.
 */
public class Test {
    public static void main(String[] args) {
        //启动Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取service组件
        ServiceA service = (ServiceA) context.getBean("serviceA");
        //以普通的方式调用UserService对象的三个方法
        service.methodA();
    }
}