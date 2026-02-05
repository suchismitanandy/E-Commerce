package com.e_commerce.demo.repository;

import com.e_commerce.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository {

    private final List<Product> productList = new ArrayList<>();
    private final AtomicLong generateId = new AtomicLong(1);

    public Product save(Product product){
        product.setId(generateId.getAndIncrement());
        productList.add(product);
        return product;
    }

    public Product findById(Long id){
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
