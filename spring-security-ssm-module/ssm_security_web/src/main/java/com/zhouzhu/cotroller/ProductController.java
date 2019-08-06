package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.Product;
import com.zhouzhu.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param product
     */
    @RequestMapping("/save")
    public String save(Product product){
        iproductService.save(product);
        return "redirect:findAll.do";
    }

    @RequestMapping("findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true) String orderId){
        ModelAndView modelAndView=new ModelAndView();

        return modelAndView;
    }
}
