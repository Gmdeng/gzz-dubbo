package com.gzz.dubbo.product.service.impl;

import com.google.common.collect.Lists;
import com.gzz.dubbo.product.domain.Product;
import com.gzz.dubbo.product.service.IProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService implements IProductService {
    @Value("${server.port}")
    private String serverPort;

    private final AtomicLong counter = new AtomicLong();

    @Override
    public Product getProduct(String no) {
        Product m = new Product(no, "洗衣机");
        counter.incrementAndGet();
        m.setLevel(counter.intValue());
        m.setDesc("Server Port:" + serverPort + " ||||");
        return m;
    }

    @Override
    public List<Product> getProductList() {
        List<Product> list = Lists.newArrayList(
                new Product(UUID.randomUUID().toString(), "冰箱"),
                new Product(UUID.randomUUID().toString(), "电视机"),
                new Product(UUID.randomUUID().toString(), "洗衣机"),
                new Product(UUID.randomUUID().toString(), "风扇"),
                new Product(UUID.randomUUID().toString(), "电动车")
        );
        return list;
    }
}
