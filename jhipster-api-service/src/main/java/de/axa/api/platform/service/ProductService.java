package de.axa.api.platform.service;

import de.axa.api.platform.web.gen.api.ProductsApiDelegate;
import de.axa.api.platform.web.gen.api.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements ProductsApiDelegate{
    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Override
    public ResponseEntity<List<Product>> getProducts(Integer maxInteger) {
          // Lets do same sample products
          Product productOne = new Product();
          productOne.setTitle("My Product One");
          productOne.setPrice(new BigDecimal(20));

          Product productTwo = new Product();
          productTwo.setTitle("My Product Two");
          productTwo.setPrice(new BigDecimal(30));

          List<Product> products = new ArrayList<>();
          products.add(productOne);
          products.add(productTwo);

          return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
