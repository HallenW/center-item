package com.example.center.item.controller;

import com.example.center.item.api.BrandService;
import com.example.center.item.dto.Brand;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author silun.wang
 * @date 2019/1/29
 */
@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation(value = "插入品牌",notes = "插入品牌")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation",  responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping("/saveBrand")
    public void saveBrand(){
        Brand brand = new Brand();
        brand.setBrandCode("WSL");
        brand.setBrandDesc("WSL");
        brandService.insertBrand(brand);
    }
}
