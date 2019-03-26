#系统结构

###1. eureka-server 注册中心
    1 为整个架构注册中心
###2. eureka-client,eureka-clientA 
    1 微服务生产者或消费者
    2 dao层使用tk.mybatis
    3 持久层使用mysql
    4 缓存使用spring自带RedisTemplate
    5 定时任务使用spring-boot注解cron形式
    6 log使用spring自带slf4j
    7 注册在eureka-server上的服务可以相互调用
###3. config-server 动静态配置中心
    1 在git上管理动静态配置
###4. cloud-config 配置获取demo
    2 可以作为一个服务提供动态配置
###5 docker支持