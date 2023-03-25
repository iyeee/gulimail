package com.modq.gulimail.coupon.dao;

import com.modq.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 16:31:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
