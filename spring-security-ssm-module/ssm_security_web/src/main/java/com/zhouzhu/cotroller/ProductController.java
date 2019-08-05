package com.zhouzhu.cotroller;

import com.zhouzhu.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-02 16:05
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IproductService iproductService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();


        modelAndView.addObject("productList",iproductService.findAll());
        modelAndView.setViewName("product-list");
        return modelAndView;
    }
}
