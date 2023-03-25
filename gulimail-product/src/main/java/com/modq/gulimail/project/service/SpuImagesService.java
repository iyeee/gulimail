package com.modq.gulimail.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modq.common.utils.PageUtils;
import com.modq.gulimail.project.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author modq
 * @email iyeee777@gmail.com
 * @date 2023-03-23 19:34:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

