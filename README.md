# meowcloud-api

---

该项目为猫猫云的聚合层，用于与前端交互和统筹下游服务

## 项目结构

- meowcloud-adaptation : 负责直接处理http请求相关内容
  
  - config  : http相关的配置
    
    - GlobalCorsConfig : 跨域策略配置
    - GlobalExceptionHandler : 全局错误处理
    - GlobalResponseHandler : 全局响应处理
    - Swagger : SwaggerAPI配置
    - TracerConfig : 分布式Trace配置

  - http
     
    - api : 请求接口
    - controller : 请求控制

- meowcloud-app : 负责启动项目

- meowcloud-common : 负责项目公共资源的管理

  - config : 公共配置
  - consts : 常量
  - enums : 枚举
  - exception : 自定义异常
  - properties : 配置属性解析
  - Result : 自定义返回类

- meowcloud-domain
  
  - model : 数据模型

    - cmd : 请求数据模型
    - entity : 常规Java对象
    - vo : 值对象

- meowcloud-infrastructure : 负责基础设施和远程调用的管理