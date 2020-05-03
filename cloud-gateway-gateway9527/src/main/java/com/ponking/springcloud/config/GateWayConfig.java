package com.ponking.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ponking
 * @ClassName GateWayConfig
 * @date 2020/4/27--15:41
 **/
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_to_ponking1",
                r->r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }


    @Bean
    public RouteLocator customRouteLocator1(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_to_ponking2",
                r->r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
