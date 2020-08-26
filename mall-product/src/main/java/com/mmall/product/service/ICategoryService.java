package com.mmall.product.service;

import com.mmall.product.entity.CategoryEntity;

import java.util.List;

/**
 * @author hut
 * @date 2020/8/14 4:25 下午
 */
public interface ICategoryService {
    List<CategoryEntity> listWithTree();
}
