下载maven:

官网：

[Maven – Download Apache Maven](https://maven.apache.org/download.cgi)

文件下载：

![image-20210429143451721](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210429143451721.png)

解压到任意路径下

## version标红

要清除缓存，file->invalidate catche....

## 打包jar包标红：

加入parent节点的version结点，如果还标红，清除缓存。

## 运行失败：

要注意 **@XXXX** 这样的不是注释，是要告诉编译器它是个什么东西，一定要加

## 其余：

1.运行cmd，可以在下图中直接敲cmd回车。

![image-20210429152010354](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210429152010354.png)

2.找到父项目：

Ctrl+b

3.ctrl +f：搜索



HelloWorld

1. 创建maven工程

2. 引入依赖

   parent和dependices

3. 创建主程序

4. 编写业务

   不要忘记告诉编译器他们各自都是谁@XXX

5. 测试直接运行main方法

6. 简化配置

   application.properties

7. 简化部署：打成jar包，在目标服务器执行即可。

   

   

   

   

   