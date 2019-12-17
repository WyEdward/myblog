package cn.wyedward.service.impl;


import cn.wyedward.dao.BlogTypeDao;
import cn.wyedward.domain.BlogType;
import cn.wyedward.dto.PageBean;
import cn.wyedward.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogTypeServiceImpl implements BlogTypeService {
    @Autowired
    private BlogTypeDao blogtypeDao;

    @Override
    public List<BlogType> findAll() {
        System.out.println("业务层次：执行了查询方法");
        return blogtypeDao.findAll();
    }

    @Override
    public PageBean<BlogType> ListByPage(PageBean<BlogType> pageBean) {
        //查询分页结果
        pageBean.setResult(blogtypeDao.ListByPage(pageBean.getStart(),pageBean.getEnd()));
        //查询总记录数
        pageBean.setTotal(blogtypeDao.getTotal());
        return pageBean;
    }

    @Override
    public Integer addBlogType(BlogType blogType) {
        return blogtypeDao.addBlogType(blogType);
    }

    @Override
    public Integer deleteBlogType(Integer id) {
        return blogtypeDao.deleteBlogType(id);
    }

    @Override
    public Integer updateBlogType(BlogType blogType) {
        return blogtypeDao.updateBlogType(blogType);
    }

}
