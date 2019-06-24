package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Product;

@Dao
@ConfigAutowireable
public interface ProductRepository {
  @Select
  public List<Product> selectAll();
  @Select
  public Product selectProduct(String ProductID);
  @Select
  public List<Product> searchAll(String ProductID, String ProductName, BigDecimal PriceFrom, BigDecimal PriceTo);
  @Insert
  @Transactional
  int insert(Product product);
  @Update
  int update(Product product);
}