package com.wen.wenmall.product.dao;

import com.wen.wenmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 00:37:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
