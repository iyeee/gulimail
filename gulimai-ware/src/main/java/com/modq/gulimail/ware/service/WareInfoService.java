package com.modq.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-25 21:03:46
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

