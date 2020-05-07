package com.ponking.springcloud.alibaba.controller;

import com.ponking.springcloud.alibaba.domain.CommonResult;
import com.ponking.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ponking
 * @ClassName StorageController
 * @date 2020/5/7--16:32
 **/
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;


    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
