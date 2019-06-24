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

  public List<Product> getProductAll() {
      return productRepository.selectAll();
  }

  public Product getProduct(String ProductID) {
      return productRepository.selectProduct(ProductID);
  }

  public List<Product> searchProduct(String ProductID, String ProductName, BigDecimal PriceFrom, BigDecimal PriceTo) {
      return productRepository.searchAll(ProductID,ProductName,PriceFrom,PriceTo);
  }

  public int insert(String ProductID, String ProductName, String ProductType, BigDecimal Price) {
	  Product product = new Product();
	  product.ProductID = ProductID;
	  product.ProductName = ProductName;
	  product.ProductType = ProductType;
	  product.Price = Price;
    return productRepository.insert(product);
  }
  
  public int update(String ProductID, String ProductName, String ProductType, BigDecimal Price) {
	  Product product = new Product();
	  product.ProductID = ProductID;
	  product.ProductName = ProductName;
	  product.ProductType = ProductType;
	  product.Price = Price;
    return productRepository.update(product);
  }

}