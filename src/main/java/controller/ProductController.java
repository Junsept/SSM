package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;
import service.ProductService;

@Controller
@RequestMapping("")
public class ProductController {
   @Autowired
   ProductService productService;
   
   @RequestMapping("/listProduct")   
   public String listProduct(Model model){
       List<Product> product = productService.list();      
       for(Product p : product){
    	   System.out.println(p.getName());
       }
       // 放入转发参数
       model.addAttribute("p", product);
       // 放入jsp路径
       return "listProduct";
   }
   
}
