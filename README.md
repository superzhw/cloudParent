# cloudParent
springcloud demo项目

#添加host映射：
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com

#Discovery服务发现
启动类添加@EnableDiscoveryClient注解
注入@Autowired
   private DiscoveryClient discoveryClient;

#使用zookeeper注册中心
现在lunix系统下安装zookeeper环境，正常启动后，新建项目，引入jar包，改yml，主启动，把服务注册进zookeeper服务中心（并且是临时节点，一定时间后自动删除）



