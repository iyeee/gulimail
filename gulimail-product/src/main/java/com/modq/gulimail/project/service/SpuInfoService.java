package com.modq.gulimail.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.project.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-23 19:34:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

