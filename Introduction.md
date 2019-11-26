# zookeeper+Dubbo
Zookeeper和Eureka相比，最大不同就是采用接口调用

Dubbo是集大成的组件，包含了Hystrix、feign、ribbon等功能，一个注解即可自动配置完成

# 注意
1、进行测试的时候，必须保证测试类与实体类报名路径一致
2、进行测试的时候，必须保证dao层的xml文件在resources下
3、测试必须有springBoot启动类
4、必须有mapperSacan扫描注解