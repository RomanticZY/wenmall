package com.wen.wenmall.coupon.dao;

import com.wen.wenmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 01:09:22
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
