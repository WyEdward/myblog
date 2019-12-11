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

}
