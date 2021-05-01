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

