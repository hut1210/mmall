package com.mmall.product.controller;

import com.mmall.common.utils.BaseResultUtil;
import com.mmall.common.vo.ResultVo;
import com.mmall.product.entity.CategoryEntity;
import com.mmall.product.service.ICategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hut
 * @date 2020/8/14 4:22 下午
 */
@RestController
@RequestMapping("product/category")
@Api(value = "商品三级分类")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/list/tree")
    @ApiOperation(value = "商品分类列表")
    public ResultVo<List<CategoryEntity>> list(){
        List<CategoryEntity> entityList = categoryService.listWithTree();
        return BaseResultUtil.success(entityList);
    }
}
