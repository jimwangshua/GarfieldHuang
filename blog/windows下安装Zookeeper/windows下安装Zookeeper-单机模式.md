# 一、前言

​	zk在开发中也需要启动以便测试

​	ZooKeeper的安装模式分为三种，分别为：单机模式（stand-alone）、集群模式		和集群伪分布模式。ZooKeeper 单机模式的安装相对比较简单，如果第一次接触ZooKeeper的话，建议安装ZooKeeper单机模式或者集群伪分布模式。

​	本文全文为`单机模式`安装

# 二、实践

> 前提条件，本机已经安装
>

1. 下载zookeeper安装包  	 [点击进入下载列表](http://mirrors.shu.edu.cn/apache/zookeeper/)

2. 解压一下，放在你想放的地方 

   例如：![01](D:\github\GarfieldHuang\blog\windows下安装Zookeeper\img\01.png)

3. 在当前存放目录下新建一个data以及log目录

   ![02](D:\github\GarfieldHuang\blog\windows下安装Zookeeper\img\02.png)

4. 进入conf 复制 zoo_sample.cfg 并粘贴到当前目录下，命名zoo.cfg

   ![03](D:\github\GarfieldHuang\blog\windows下安装Zookeeper\img\03.png)

5. 修改zoo.cfg文件

   ![04](D:\github\GarfieldHuang\blog\windows下安装Zookeeper\img\04.png)

6. 进入bin目录下双击运行zkserver.cmd

# 三、编后语

> ​	不积跬步，无以至千里。
>
> ​	不积小流，无以成江海。




>---
> ### 感谢您耐心阅读黄大胖子的陋文，由于我还是一个未经世事的美男子，才疏学浅，如有错误之处，请多多指正！
> ##### 江湖再见，欢迎您关注我！ ![image](https://github.com/GarfieldHuang/GarfieldHuang/blob/master/img/zhencheng.png?raw=true)
>![image](https://github.com/GarfieldHuang/GarfieldHuang/blob/master/img/%E5%BE%AE%E4%BF%A1%E5%85%AC%E4%BC%97%E5%8F%B7/%E6%90%9C%E4%B8%80%E6%90%9C%E5%85%AC%E4%BC%97%E5%8F%B7%E6%8E%A8%E5%B9%BF%E7%89%A9%E6%96%99%E5%9B%BE%E7%89%87-png/%E6%89%AB%E7%A0%81_%E6%90%9C%E7%B4%A2%E8%81%94%E5%90%88%E4%BC%A0%E6%92%AD%E6%A0%B7%E5%BC%8F-%E6%A0%87%E5%87%86%E8%89%B2%E7%89%88.png?raw=true)
> 本文项目源代码 ：[GarfieldHuang/GarfieldHuang](https://github.com/GarfieldHuang/GarfieldHuang)


>---