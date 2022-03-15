# excel-process

## 介绍

利用java通过EasyExcel读取和写入模版

## 软件架构

#### 项目结构

``` -mall![img.png](img.png)
├── project
    ├── enums
       ├── ProjectNameEnum -- 项目路径配置文件
    ├── excel
        ├── reader -- easyExcel的读文件封装类
        ├── writer -- easyExcel的写文件封装类
    ├── project
        ├── demo -- demo模块，供学习
        ├── xxxx1 -- 项目1
        ├── xxxx2 -- 项目2

├── resource
    ├── demo -- demo模块的资源文件
        ├── xxxx1 -- 项目1的资源文件
        ├── xxxx2 -- 项目2的资源文件

```

## 核心技术栈

| 后端技术 |  版本号
| -------------------- |  -------------------- |                             
| Easyexcel|3.0.5
| Mysql-Connector-java|8.0.28
| Mssql-Jdbc|  9.2.1.jre8
| Lombok|3.4.0

## 项目教程

项目包含demo，可以参考，本地环境搭建启动，步骤如下：

1. **创建基础项目**

    - 在project里面创建包名xxx

    - 创建pojo包、并创建相应excel的pojo类

    - 在resources里面创建同意的包名xxx

    - 在enums.ProjectNameEnum里面创建对应的枚举xxx

    - 导入相应的xls、xlsx、csv（excel）文件到resources文件内

2. **处理文件**

    - 将逻辑按深浅可以在自己的子项目包中创建自己的类进行处理

    - 利用MyExcelReader和MyExcelWriter对资源文件进行读写






