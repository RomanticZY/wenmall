package com.wen.wenmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wen.wenmall.common.utils.PageUtils;
import com.wen.wenmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 01:14:31
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

