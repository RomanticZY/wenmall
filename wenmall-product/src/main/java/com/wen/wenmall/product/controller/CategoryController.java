package com.wen.wenmall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wen.wenmall.product.entity.CategoryEntity;
import com.wen.wenmall.product.service.CategoryService;
import com.wen.wenmall.common.utils.PageUtils;
import com.wen.wenmall.common.utils.R;



/**
 * 商品三级分类
 *
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 00:37:04
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有的分类以及子分类.以属性结构组装起来列表
     */
    @RequestMapping("/list/tree")
        public R list(){
      List<CategoryEntity> entities = categoryService.listWithTree();

        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
        public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody Long[] catIds){
		//categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
