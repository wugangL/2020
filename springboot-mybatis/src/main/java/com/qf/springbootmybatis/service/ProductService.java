package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.Product;

/**
 * @Author: 吴
 * @Date: 2020/5/3 13:42
 */

public interface ProductService {
    Product getById(Long id);
}
