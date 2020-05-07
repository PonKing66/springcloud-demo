package com.ponking.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ponking
 * @ClassName MybatisConfig
 * @date 2020/5/7--16:33
 **/
@Configuration
@MapperScan({"com.ponking.springcloud.alibaba.dao"})
public class MybatisConfig {
}
