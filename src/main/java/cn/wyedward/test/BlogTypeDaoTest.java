package cn.wyedward.test;

import cn.wyedward.dao.BlogTypeDao;
import cn.wyedward.domain.BlogType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class BlogTypeDaoTest {
    @Autowired
    private BlogTypeDao blogTypeDao;

    /**
     * 测试插入博客类别 并返回刚插入的主键
     */
    @Test
    public void addBlogType(){
        BlogType blogType = new BlogType("mysql", 13);
        int result = blogTypeDao.addBlogType(blogType);
        System.out.println(result);
        System.out.println(blogType.getId());
    }


    /**
     * 测试删除博客类别
     */
    @Test
    public void deleteBlogType(){
        Integer result = blogTypeDao.deleteBlogType(20);
        System.out.println(result);
    }

    /**
     * 测试更新博客类别
     */
    @Test
    public void updateBlogType(){
        BlogType blogType = new BlogType(19, "updateBlogtype", 13);
        Integer result = blogTypeDao.updateBlogType(blogType);
        System.out.println(result);
    }

    /**
     * 测试根据id查博客类别
     */
    @Test
    public void findBlogTypeById(){
        BlogType blogType = blogTypeDao.getById(19);
        System.out.println(blogType);
    }

    /**
     * 测试分页查询
     */
    @Test
    public void BlogTypeListByPage(){
        Integer page = 2; //第一页
        Integer pageSize = 2; //一页显示两条
        Integer start = (page - 1)* pageSize;
        Integer end = page * pageSize;
        List<BlogType> blogTypeList = blogTypeDao.ListByPage(start, end);
        for (BlogType blogType : blogTypeList) {
            System.out.println(blogType);
        }
    }
    /**
     * 测试查找总记录数
     */
    @Test
    public void getTotal(){
        Long result = blogTypeDao.getTotal();
        System.out.println(result);
    }
}