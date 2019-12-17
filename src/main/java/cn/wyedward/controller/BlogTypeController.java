package cn.wyedward.controller;

import cn.wyedward.domain.BlogType;
import cn.wyedward.dto.PageBean;
import cn.wyedward.service.impl.BlogTypeServiceImpl;
import cn.wyedward.util.ResponseUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("/blogtype")
public class BlogTypeController {

    @Autowired
    private BlogTypeServiceImpl blogtypeServiceImpl;
    /**
     * 查询所有博客类别
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：方法执行");
        List<BlogType> list = blogtypeServiceImpl.findAll();
        System.out.println(list);
        return "success";
    }

    /**
     * 分页查询博客类别
     * @param page  当前页数
     * @param rows 每页显示几行
     * @param response 响应
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    public String listBlogType(
            @RequestParam(value = "page",required = false) String page,
            @RequestParam(value = "rows",required = false) String rows,
            HttpServletResponse response) throws Exception {
        //定义分页bean
        PageBean<BlogType> pageBean = new PageBean<>(Integer.parseInt(page), Integer.parseInt(rows));
        //拿到分页结果已经记录好的pageBean
        pageBean = blogtypeServiceImpl.ListByPage(pageBean);
        //使用阿里巴巴的fastJson创建JSONObject
        JSONObject result = new JSONObject();
        //通过fastJson序列化list为jsonArray
        String jsonArray = JSON.toJSONString(pageBean.getResult());
        JSONArray array = JSONArray.parseArray(jsonArray);
        //将序列化的结果放入json对象中
        result.put("rows",array);
        result.put("total",pageBean.getTotal());
        //        //使用自定义工具类向response中写入数据
        ResponseUtil.write(response,result);
        return null;
    }

    /**
     * 添加和更新博客类别
     * @param blogType 博客类别实体
     * @param response 响应
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    public String save(BlogType blogType, HttpServletResponse response) throws Exception {
        int resultTotal = 0; //接受返回结果记录数
        if(blogType.getId() == null){
            resultTotal = blogtypeServiceImpl.addBlogType(blogType);
        }else{
            resultTotal = blogtypeServiceImpl.updateBlogType(blogType);
        }

        JSONObject result = new JSONObject();
        if(resultTotal > 0){
            result.put("success",true);
        }else{
            result.put("success",false);
        }
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * 博客类别信息删除
     * @param ids
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/delete")
    public String deleteBlog(
            @RequestParam(value = "ids", required = false) String ids,
            HttpServletResponse response) throws Exception {
        //分割字符串得到id数组
        String[] idsStr = ids.split(",");
        JSONObject result = new JSONObject();
        for(int i = 0; i < idsStr.length; i++){
            int id = Integer.parseInt(idsStr[i]);
            //其实这里我们要判断博客类别下面是否有博客，如果有就禁止删除博客
            blogtypeServiceImpl.deleteBlogType(id);
        }
        result.put("success", true);
        ResponseUtil.write(response, result);
        return null;
    }
}
