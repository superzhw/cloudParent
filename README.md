# cloudParent
springcloud demo项目
- 集群 7001，7002 eureka 服务端
6001 zookeeper服务提供者，6002 zookeeper服务消费者
5001 consul服务提供者，5002 consul服务消费者
9001 eureka-gateway 网关服务（cloud-gateway）
8031 eureka-hystrix 服务断路器，图形化监控
8003 eureka-openfeign 服务消费者（cloud-open-order-service），8002 eureka-ribbon 服务消费者（cloud-order-service），
- 集群 8001 eureka 服务提供者（cloud-provider-service），8011 eureka 服务提供者（cloud-provider-service）
8022 eureka-openfeign-hystrix 服务消费者（cloud-feign-hystrix-service），8021 eureka-openfeign-hystrix 服务提供者（cloud-hystrix-service）

#添加host映射：
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com

#Discovery服务发现
启动类添加@EnableDiscoveryClient注解
注入@Autowired
   private DiscoveryClient discoveryClient;

# 安装软件在file文件夹

#使用zookeeper注册中心
现在lunix系统下安装zookeeper环境，正常启动后，新建项目，引入jar包，改yml，主启动，把服务注册进zookeeper服务中心（并且是临时节点，一定时间后自动删除）

#consul 安装下载
在官网上下载consul，然后在当前路径下 consul --verison 查看版本，consul agent -dev 启动consul，访问路径：http://localhost:8500/

#open feign服务调用 内置负载均衡（默认轮询）
服务提供方不用操作，在服务消费方配置（即只需要定义服务绑定接口切以声明式 接口+注解 === 微服务调用接口 + @FeignClient）

#hystrix断路器 （服务降级fallbak，服务熔断，服务限流）
服务提供者 及 服务消费者 都可以使用
http://localhost:8031/dashboard/hystrix hystrix限流监控

#getway 三大核心概念
Route(路由)
Predicate(断言)
Filter(过滤)


