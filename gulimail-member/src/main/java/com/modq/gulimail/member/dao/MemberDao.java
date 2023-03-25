package com.modq.gulimail.member.dao;

import com.modq.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 16:37:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
