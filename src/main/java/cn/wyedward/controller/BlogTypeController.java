package cn.wyedward.controller;

import cn.wyedward.domain.BlogType;
import cn.wyedward.service.impl.BlogTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
