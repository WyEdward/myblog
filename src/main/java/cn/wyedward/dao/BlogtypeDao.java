package cn.wyedward.dao;

import cn.wyedward.domain.Blogtype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogtypeDao {
    /**
     * 找到所有博客类别
     * @return
     */
    List<Blogtype> findAll();
}
