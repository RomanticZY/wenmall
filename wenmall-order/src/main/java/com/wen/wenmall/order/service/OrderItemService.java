package com.wen.wenmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wen.wenmall.common.utils.PageUtils;
import com.wen.wenmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 00:57:05
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
