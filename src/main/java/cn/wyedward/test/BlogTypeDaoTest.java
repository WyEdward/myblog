package cn.wyedward.test;

import cn.wyedward.dao.BlogTypeDao;
import cn.wyedward.domain.BlogType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class BlogTypeDaoTest {
    @Autowired
    private BlogTypeDao blogTypeDao;

    @Test
    public void addBlogType(){
        BlogType blogType = new BlogType("mysql", 13);
        int result = blogTypeDao.addBlogType(blogType);
        System.out.println(result);
        System.out.println(blogType.getId());
    }


}