package com.wen.wenmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wen.wenmall.product.entity.BrandEntity;
import com.wen.wenmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WenmallProductApplicationTests {
@Autowired
private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
