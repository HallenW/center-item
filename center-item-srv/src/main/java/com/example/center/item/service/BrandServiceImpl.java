package com.example.center.item.service;

import com.example.center.item.api.BrandService;
import com.example.center.item.dto.Brand;
import com.example.center.item.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author silun.wang
 * @date 2019/1/29
 */
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    BrandMapper brandMapper;

    @Override
    public void insertBrand(Brand brand) {
        brandMapper.insertBrand(brand);
    }
}
