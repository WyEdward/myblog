package cn.wyedward.test;

import cn.wyedward.service.impl.BlogTypeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*获取核心容器*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-service.xml");
        BlogTypeServiceImpl bs = (BlogTypeServiceImpl) ac.getBean("blogtypeServiceImpl");
        bs.findAll();
    }
}
