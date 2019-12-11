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
     * 找到所有
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：方法执行");
        List<BlogType> list = blogtypeServiceImpl.findAll();
        System.out.println(list);
        return "success";
    }
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
        //使用自定义工具类向response中写入数据
        ResponseUtil.write(response,result);
        return null;
    }
}
