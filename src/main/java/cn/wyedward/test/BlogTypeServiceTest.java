package cn.wyedward.test;


import cn.wyedward.domain.BlogType;
import cn.wyedward.dto.PageBean;
import cn.wyedward.service.impl.BlogTypeServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class BlogTypeServiceTest {
    @Autowired
    private  BlogTypeServiceImpl blogtypeServiceImpl;
    @Test
    public void testListByPage(){
        System.out.println(blogtypeServiceImpl);
        PageBean<BlogType> blogTypePageBean = new PageBean<>(2, 2);
        System.out.println(blogTypePageBean);
        blogTypePageBean = blogtypeServiceImpl.ListByPage(blogTypePageBean);
        System.out.println(blogTypePageBean);
    }
}
