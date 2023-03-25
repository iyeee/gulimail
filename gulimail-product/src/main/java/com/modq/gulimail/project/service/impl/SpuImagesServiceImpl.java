package com.modq.gulimail.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modq.common.utils.PageUtils;
import com.modq.common.utils.Query;
import com.modq.gulimail.project.dao.SpuImagesDao;
import com.modq.gulimail.project.entity.SpuImagesEntity;
import com.modq.gulimail.project.service.SpuImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}