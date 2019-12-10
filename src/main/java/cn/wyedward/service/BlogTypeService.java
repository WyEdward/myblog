package cn.wyedward.service;

import cn.wyedward.domain.Blogtype;

import java.util.List;

public interface BlogTypeService {
    /**
     * 找到所有博客类别
     * @return
     */
    List<Blogtype> findAll();
}
