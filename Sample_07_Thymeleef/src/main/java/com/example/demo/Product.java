package com.example.demo;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Column;
import java.math.BigDecimal;

@Entity
@Table(name="Product")
public class Product {
  @Id
  @Column(name="ProductID")
  public String ProductID;
  @Column(name="ProductType")
  public String ProductType;
  @Column(name="ProductName")
  public String ProductName;
  @Column(name="Price")
  public BigDecimal Price;
  }