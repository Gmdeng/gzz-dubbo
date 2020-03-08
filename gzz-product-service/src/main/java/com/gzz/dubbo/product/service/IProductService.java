package com.gzz.dubbo.product.service;

import com.gzz.dubbo.product.domain.Product;

import java.util.List;

public interface IProductService {
    Product getProduct(String no);

    List<Product> getProductList();
}
