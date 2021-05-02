# 静态资源

## 处理静态资源的方式：

- webjars	`localhost:8080/webjars/`
- resources, static,public, /\**,    `localhost:8080/`

优先级：以上顺序

在templates下的所有页面，只能通过controller来跳转



# 首页和图标

放置的位置可在文档中查看，或者读源码



# thymeleaf

Java模板引擎

网站实现界面和数据分离

文档:[Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-texts)

所有的html元素都可以被thymeleaf接管： th:元素名--

ctrl+f5缓存刷新

导入的依赖thymeleaf-spring5



# SpringMVC配置原理

自定义一些定制化功能，只需要在MyConfig上重写，然后@bean自动装配。

可用来修改SpringBoot默认配置

扩展MVC

视图跳转：

​	要跳转的视图放到templates下。

​	![image-20210502084044854](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210502084044854.png)

xxxxx Configuration.	帮助进行扩展配置



# bootstrap

[bootstrap](https://blog.csdn.net/sinat_41696687/article/details/113562318?ops_request_misc=%7B%22request%5Fid%22%3A%22161990524516780261991701%22%2C%22scm%22%3A%2220140713.130102334..%22%7D&request_id=161990524516780261991701&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-113562318.first_rank_v2_pc_rank_v29&utm_term=bootstrap)



# 后台管理系统

网站主页用Config来配置好一些，而不是Controller

重定向防止表单重复提交：

![image-20210502103950998](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210502103950998.png)

判断用户名和密码

![image-20210502110542759](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210502110542759.png)

是否登录

不可能给每个拦截器写，所以最好使用拦截器机制



模板引擎，templates文件夹下所有的页面的解析，一定都是经过解析处理，最后经过模板引擎来解析，直接访问访问不到，直接访问只能访问到静态文件夹下的，所以相当于处理了一个请求，请求名叫main.html，请求跳到main页面。



公共页面：

thymeleaf可定义公共内容

用th:insert	th:replace	th:include	三种形式copy一份。区别见文档



不知道为什么，这里的main.html，必须得有html

```
<li><a th:href="@{/main.html}"><i class="fa fa-home"></i> <span>Dashboard</span></a></li>
```



取用户输入的用户名

```
[[${session.loginUser.userName}]]
```



放在model中就是放在请求域中

```
model.addAttribute("users",users);
```

遍历数据

```
<tr class="gradeX" th:each="user,status:${users}">
    <td th:text="${status.count}"></td>	//索引
    <td th:text="${user.userName}"></td>
    <td>[[${user.password}]]</td>
</tr>
```



视图解析与模板引擎

## 拦截器

### 1、handlerInterceptor

- 编写一个拦截器，实现HandlerInterceptor

- 拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors方法）

- 指定拦截规则【拦截所有时，静态资源也会被拦截】

![image-20210502205540781](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210502205540781.png)



![image-20210502205611502](C:\Users\cjy\AppData\Roaming\Typora\typora-user-images\image-20210502205611502.png)





源码分析：



