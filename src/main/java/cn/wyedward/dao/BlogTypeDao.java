package cn.wyedward.dao;

import cn.wyedward.domain.BlogType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogTypeDao {
    /**
     * 找到所有
     * @return
     */
    List<BlogType> findAll();

    /**
     * 添加博客类别信息
     * @param blogType 博客类别
     * @return 刚添加的主键值
     */
    Integer addBlogType(BlogType blogType);

    /**
     * 根据id删除博客类别信息
     * @param id 主键值
     * @return
     */
    Integer deleteBlogType(Integer id);

    /**
     * 更新博客类别信息
     * @param blogType
     * @return
     */
    Integer updateBlogType(BlogType blogType);

    /**
     * 根据id查博客类别
     * @param id 类别id
     * @return 博客类别
     */
    BlogType getById(Integer id);

    /**
     * 分页查询博客类别信息
     * @param start
     * @param end
     * @return
     */
    List<BlogType> ListByPage(@Param("start") Integer start,@Param("end") Integer end);

    /**
     * 查询总记录数
     * @return
     */
    Long getTotal();
}
