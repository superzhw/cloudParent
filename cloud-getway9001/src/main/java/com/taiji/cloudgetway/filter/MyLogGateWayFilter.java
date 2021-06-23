package com.taiji.cloudgetway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * gateway自定义过滤器
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    // http://localhost/cloud/user/findUserById/5?uname=1 全局过滤器
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*********gateway自定义过滤器"+new Date());
//        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
//        if(uname == null){
//            log.info("*******非法账号********");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return exchange.getResponse().setComplete();
//        }
        return chain.filter(exchange);
    }

    /**
     * 执行顺序 越小越先执行
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
