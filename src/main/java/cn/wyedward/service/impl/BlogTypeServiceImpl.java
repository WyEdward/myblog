package cn.wyedward.service.impl;


import cn.wyedward.dao.BlogTypeDao;
import cn.wyedward.domain.BlogType;
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

}
