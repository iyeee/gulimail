package com.modq.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 16:49:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

