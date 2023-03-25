package com.modq.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 16:37:19
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

