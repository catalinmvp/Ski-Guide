package com.wad.fils.course6.services;

import com.wad.fils.course6.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductSV{
  List<Product> products = new ArrayList(List.of(
          new Product("Rossignol - Skis",500),
          new Product("Rossignol - District Black Wide Snowboard",300),
          new Product("Snowboard Bindings",100),
          new Product("Stealth MAG Goggles",100)

  ));


  @Override
  public List<Product> findAll() {
    return products;
  }

  @Override
  public void save(Product p) {
    if(p.getId()==null)
      p.setId(new Random().nextLong());
    products.add(p);
  }
}
