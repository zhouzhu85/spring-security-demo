package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.ProductDO;
import com.zhouzhu.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     *  查询全部产品
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("productList",iproductService.findAll());
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    /**
     * 产品添加
     * @param productDO
     */
    @RequestMapping("/save")
    public String save(ProductDO productDO){
        iproductService.save(productDO);
        return "redirect:findAll.do";
    }

}
