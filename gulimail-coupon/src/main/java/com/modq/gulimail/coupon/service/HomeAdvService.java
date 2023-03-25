package com.modq.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 16:31:31
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

