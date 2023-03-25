package com.modq.gulimail.project;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.modq.gulimail.project.entity.BrandEntity;
import com.modq.gulimail.project.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimailProjectApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setName("华为");
        // brandService.save(brandEntity);
        // System.out.println("save success");

        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",2));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
