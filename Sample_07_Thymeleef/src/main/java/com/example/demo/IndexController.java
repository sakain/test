package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Product;
import com.example.demo.ProductService;
import java.util.List;
import java.math.BigDecimal;

@Controller
public class IndexController {
  @Autowired
  ProductService productService;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  String index(Model model) {
    return "index";
  }
  @RequestMapping(value = "/company/", method = RequestMethod.GET)
  String comapny(Model model) {
    return "contents/company";
  }
  @RequestMapping(value = "/service/", method = RequestMethod.GET)
  String service(Model model) {
    return "contents/service";
  }
  @RequestMapping(value = "/recruit/", method = RequestMethod.GET)
  String recruit(Model model) {
    return "contents/recruit";
  }
  @RequestMapping(value = "/contact/", method = RequestMethod.GET)
  String contact(Model model) {
    return "contents/contact";
  }
  @RequestMapping(value = "/product/", method = RequestMethod.GET)
  String product(Model model) {
    List<Product> products = productService.getProduct();
    model.addAttribute("products", products);
  	return "contents/product";
  }
  @RequestMapping(value = "/search/", method = RequestMethod.GET)
  String search(Model model) {
  	return "contents/search";
  }
  
  private static final String VIEW = "/contents/search.html";
  
  @RequestMapping(value = "/search/", params = "search", method = RequestMethod.POST)
  public ModelAndView search(ModelAndView mav
      , @RequestParam("goodsId") String goodsId
      , @RequestParam("goodsName") String goodsName
      , @RequestParam("priceFrom") BigDecimal priceFrom
      , @RequestParam("priceTo") BigDecimal priceTo) {
    
    mav.setViewName(VIEW);
    mav.addObject("goodsId", goodsId);
    mav.addObject("goodsName", goodsName);
    mav.addObject("priceFrom", priceFrom);
    mav.addObject("priceTo", priceTo);
    
    List<Product> result = productService.searchProduct(goodsId,goodsName,priceFrom,priceTo);
    
    mav.addObject("result", result);
    mav.addObject("resultSize", result.size());
    
    return mav;
  }
  
  @RequestMapping(value = "/search/", params = "goto_menu", method = RequestMethod.POST)
  String goto_menu(Model model) {
	  return "index";
  }
}