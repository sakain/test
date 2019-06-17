package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Product;
import com.example.demo.ProductRepository;
import java.math.BigDecimal;

@Service
@Transactional
public class ProductService {

  @Autowired
  ProductRepository productRepository;

  public List<Product> getProduct() {
      return productRepository.selectAll();
  }

  public List<Product> searchProduct(String goodsId, String goodsName, BigDecimal priceFrom, BigDecimal priceTo) {
      return productRepository.searchAll(goodsId,goodsName,priceFrom,priceTo);
  }

  public int insert(String id, String type, String name, Integer price) {
	  Product product = new Product();
	  product.ProductID = id;
	  product.ProductType = type;
	  product.ProductName = name;
	  product.Price = price;
    return productRepository.insert(product);
  }
}