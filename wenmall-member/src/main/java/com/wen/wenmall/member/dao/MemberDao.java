package com.wen.wenmall.member.dao;

import com.wen.wenmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wenqingsahn
 * @email wenqingsahn3@gmail.com
 * @date 2022-11-25 01:14:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
