<div align="center">
<br/>
<br/>
<img src="https://pandao.github.io/editor.md/images/logos/editormd-logo-180x180.png" width="90px" style="margin-top:30px;"/>
  <h1 align="center">
    ibss-rule-core
  </h1>
  <h4 align="center">
    XXXXX
  </h4> 

[预 览](http://localhost:8080/swagger-ui.html)   |   [官 网](http://www.XXX.com/)   |  [文档](http://XXXX/README.md)


</div>

<p align="center">
    <a href="#">
        <img src="https://img.shields.io/badge/spring--boot-2.4.5-green" alt="Jquery Version">
    </a>
      <a href="#">
        <img src="https://img.shields.io/badge/mybatis--plus-3.4.1-green" alt="Layui Version">
    </a>
    </a>
      <a href="#">
        <img src="https://img.shields.io/badge/drools-7.49.0.Final-green" alt="Layui Version">
    </a>
    </a>
      <a href="#">
        <img src="https://img.shields.io/badge/springfox--swagger2-2.9.2-green" alt="Layui Version">
    </a>
</p>


#### 项目介绍

<p style="padding:10px;"  width="90%">

基于springboot+mybatis-plus+drools

</p>

#### 项目结构

```
framework
│
├─framework-common 公共资源
│	│
│	├─collections 集合相关工具类
│	│
│	├─config 配置文件
│	│
│	├─constant 常量、枚举
│	│
│	├─data 请求响应数据、错误码
│	│
│	├─exception 业务异常
│	│
│	└─utils 工具类
│
├─framework-component service组件层(主要负责与dao交互)
│	│
│	└─service 封装与dao交互的service
│
├─framework-core 核心层
│	│
│	├─controller 主业务controller
│	│
│	├─data 业务数据
│	│
│	├─handler 业务异常、日志处理
│	│
│	├─service 核心业务代码处理
│	│
│	├─RuleCoreApplication 项目启动main方法
│	│
│	└─resource 配置文件、xml文件、drl文件等
│
├─framework-dao 与数据库交互层
│	│
│	├─common XXXDao.java
│	│
│	└─mapper XXXMapper.java
│
├─framework-web 全局入口层(对外接口定义)
│	│
│	├─controller controller接口
│	│
│	├─request web请求数据封装
│	│
│	└─response web响应数据封装
│
└─ 入口 项目启动成功之后点击上面预览链接预览
```

#### 项目结构说明

##### rule-web层

> 对外接口定义包括请求和响应数据的定义, 是整个项目web请求的入口

##### rule-core层

> 专注核心业务的处理, 不应该涉及其他与业务无关的处理, 主要负责与component层交互, 不允许直接与dao层
> 交互, 需要查数据库由component层处理. 避免由于过于复杂的业务导致业务层出现过多的查库逻辑的代码, 比如一个
> 业务需要查多张表甚至多数据源的多张表, 这样业务层会出现非常多的xxxDao、xxxMapper,代码会显得非常凌乱 
> 业务层应该只关心从component层拿数据, 而不应该去关心数据从哪里来, 这样核心业务层代码更加清晰

##### rule-component层

> 负责与dao层交互, 复杂的查询数据库的逻辑在该层处理, 简单的查库逻辑框架已经集成直接调用即可

##### rule-dao层

> 负责与数据库交互, mybatis-plus框架已经封装了大量的通用方法, 复杂的逻辑我们自己根据业务自定义处理即可

_优点_

1. 结构清晰, 层次分明, 符合JAVA设计原则单一职责, 每一层各司其职
2. 代码可读性好, 扩展性好, 逻辑更加清晰
3. 代码量越大或者说项目迭代升级的次数越多优势越明显
4. 项目结构比较多看起来比较大, 其实是个轻量级框架, 依赖非常少

_缺点_
1. 因为分层多的缘故, 所以看起来包比较多
2. 项目依赖关系相对复杂, 因为是框架层面的基本上不会改变, 所以影响不大

#### 项目依赖关系图

```seq
core->web: 依赖
core->component: 依赖
component->dao: 依赖
dao->web: 依赖
web->common: 依赖
```

#### web请求调用流程图

```seq
浏览器->web: 请求
web->core: 调用
core->component: 调用
component->dao: 调用
component->mapper: 调用
dao-->>component: dao返回
mapper-->>component: mapper返回
component-->>core: 返回结果
core-->>web: 返回结果
web-->>浏览器: 返回结果
```

#### 如果不显示流程图, 复制README.md下面的所有文字在下面链接打开后粘贴就能看预览效果
[流程图预览链接](https://www.zybuluo.com/mdeditor)
