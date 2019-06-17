package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
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
  public List<Product> searchAll(String goodsId, String goodsName, BigDecimal priceFrom, BigDecimal priceTo);
  @Insert
  @Transactional
  int insert(Product product);
}