package cn.wyedward.test;

import cn.wyedward.service.impl.BlogtypeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*获取核心容器*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-service.xml");
        BlogtypeServiceImpl bs = (BlogtypeServiceImpl) ac.getBean("blogtypeServiceImpl");
        bs.findAll();
    }
}
