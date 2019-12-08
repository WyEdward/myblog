package cn.wyedward.service.impl;


import cn.wyedward.dao.BlogtypeDao;
import cn.wyedward.domain.Blogtype;
import cn.wyedward.service.BlogtypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogtypeServiceImpl implements BlogtypeService {
    @Autowired
    private BlogtypeDao blogtypeDao;
    @Override
    public List<Blogtype> findAll() {
        System.out.println("业务层次：执行了查询方法");
        return blogtypeDao.findAll();
    }
}
