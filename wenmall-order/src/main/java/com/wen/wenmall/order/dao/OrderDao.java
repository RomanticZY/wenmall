package com.wen.wenmall.order.dao;

import com.wen.wenmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 00:57:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
