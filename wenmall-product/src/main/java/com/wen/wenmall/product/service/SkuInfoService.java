package com.wen.wenmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wen.wenmall.common.utils.PageUtils;
import com.wen.wenmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 00:37:04
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

