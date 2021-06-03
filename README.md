# cloudParent
springcloud demo项目

#添加host映射：
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com

#Discovery服务发现
启动类添加@EnableDiscoveryClient注解
注入@Autowired
   private DiscoveryClient discoveryClient;