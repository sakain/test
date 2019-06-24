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
    List<Product> products = productService.getProductAll();
    model.addAttribute("products", products);
  	return "contents/product";
  }
  @RequestMapping(value = "/search/", method = RequestMethod.GET)
  String search(Model model) {
  	return "contents/search";
  }
  
  @RequestMapping(value = "/search/", params = "search", method = RequestMethod.POST)
  public ModelAndView search(ModelAndView mav
      , @RequestParam("ProductID") String ProductID
      , @RequestParam("ProductName") String ProductName
      , @RequestParam("PriceFrom") BigDecimal PriceFrom
      , @RequestParam("PriceTo") BigDecimal PriceTo) {
    
	  mav.setViewName("/contents/search.html");
	  mav.addObject("ProductID", ProductID);
	  mav.addObject("ProductName", ProductName);
	  mav.addObject("PriceFrom", PriceFrom);
	  mav.addObject("PriceTo", PriceTo);
    
	  List<Product> result = productService.searchProduct(ProductID,ProductName,PriceFrom,PriceTo);
    
	  mav.addObject("result", result);
	  mav.addObject("resultSize", result.size());
    
    return mav;
  }
  
  @RequestMapping(value = "/search/", params = "goto_menu_from_search", method = RequestMethod.POST)
  String goto_menu_from_search(Model model) {
	  return "index";
  }
  
  @RequestMapping(value = "/search/", params = "add", method = RequestMethod.POST)
  String add_product(Model model) {
	  return "contents/add";
  }

  @RequestMapping(value = "/search/", params = "goto_menu_from_add", method = RequestMethod.POST)
  String goto_menu_from_add(Model model) {
	  return "contents/search";
  }

  @RequestMapping(value = "/search/", params = "add_product", method = RequestMethod.POST)
  public ModelAndView add(ModelAndView mav
	      , @RequestParam("ProductID") String ProductID
	      , @RequestParam("ProductName") String ProductName
	      , @RequestParam("ProductType") String ProductType
	      , @RequestParam("Price") BigDecimal Price) {
	    
	    mav.setViewName("/contents/add.html");
	    mav.addObject("ProductID", ProductID);
	    mav.addObject("ProductName", ProductName);
	    mav.addObject("ProductType", ProductType);
	    mav.addObject("Price", Price);
    
	    productService.insert(ProductID,ProductName,ProductType,Price);
    
    	return mav;
  }
  
  @RequestMapping(value = "/search/", params = "update", method = RequestMethod.POST)
  public ModelAndView update_product(ModelAndView mav
		  , @RequestParam("ProductID") String ProductID
	      , @RequestParam("target_ProductID") String target_ProductID
	      , @RequestParam("target_ProductName") String target_ProductName
	      , @RequestParam("target_PriceFrom") BigDecimal target_PriceFrom
	      , @RequestParam("target_PriceTo") BigDecimal target_PriceTo) {
	    
	  Product product = productService.getProduct(ProductID);
	  mav.addObject("Product", product);

	  mav.addObject("target_ProductID", target_ProductID);
	  mav.addObject("target_ProductName", target_ProductName);
	  mav.addObject("target_PriceFrom", target_PriceFrom);
	  mav.addObject("target_PriceTo", target_PriceTo);
	  
	  mav.setViewName("/contents/update.html");
	  return mav;
  }
  
  @RequestMapping(value = "/search/", params = "update_product", method = RequestMethod.POST)
  public ModelAndView update(ModelAndView mav
	      , @RequestParam("ProductID") String ProductID
	      , @RequestParam("ProductName") String ProductName
	      , @RequestParam("ProductType") String ProductType
	      , @RequestParam("Price") BigDecimal Price
	      , @RequestParam("target_ProductID") String target_ProductID
	      , @RequestParam("target_ProductName") String target_ProductName
	      , @RequestParam("target_PriceFrom") BigDecimal target_PriceFrom
	      , @RequestParam("target_PriceTo") BigDecimal target_PriceTo) {

	  mav.setViewName("/contents/update.html");
	  productService.update(ProductID,ProductName,ProductType,Price);	    

	  Product product = productService.getProduct(ProductID);
	  mav.addObject("Product", product);

	  mav.addObject("target_ProductID", target_ProductID);
	  mav.addObject("target_ProductName", target_ProductName);
	  mav.addObject("target_PriceFrom", target_PriceFrom);
	  mav.addObject("target_PriceTo", target_PriceTo);

	  return mav;
  }

  @RequestMapping(value = "/search/", params = "goto_menu_from_update", method = RequestMethod.POST)
  ModelAndView goto_menu_from_update(ModelAndView mav
		  , @RequestParam("target_ProductID") String target_ProductID
	      , @RequestParam("target_ProductName") String target_ProductName
	      , @RequestParam("target_PriceFrom") BigDecimal target_PriceFrom
	      , @RequestParam("target_PriceTo") BigDecimal target_PriceTo) {
	  
	  mav.setViewName("/contents/search.html");
	  
	  mav.addObject("ProductID", target_ProductID);
	  mav.addObject("ProductName", target_ProductName);
	  mav.addObject("PriceFrom", target_PriceFrom);
	  mav.addObject("PriceTo", target_PriceTo);

	  List<Product> result = productService.searchProduct(target_ProductID,target_ProductName,target_PriceFrom,target_PriceTo);
    
	  mav.addObject("result", result);
	  mav.addObject("resultSize", result.size());
    
    return mav;
	  
  }

}