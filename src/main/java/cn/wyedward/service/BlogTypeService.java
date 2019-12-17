package cn.wyedward.service;

import cn.wyedward.domain.BlogType;
import cn.wyedward.dto.PageBean;

import java.util.List;

public interface BlogTypeService {
    /**
     * 找到所有博客类别
     * @return
     */
    List<BlogType> findAll();

    //分页查询
    PageBean<BlogType> ListByPage(PageBean<BlogType> pageBean);

    //添加博客类别
    Integer addBlogType(BlogType blogType);

    //删除博客类别
    Integer deleteBlogType(Integer id);

    //更新博客类别
    Integer updateBlogType(BlogType blogType);


}
