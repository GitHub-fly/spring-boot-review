# Spring-boot-start 模块

## 1. yml 配置文件 dev、prod 环境切换

## 2. 标准的 SpringBoot 风格接口和 Spring MVC风格接口

## 3. 路径参数和查询参数

## 4. MockMvc 使用

  - `perform`: 执行一个 RequestBuilder 请求，会自动执行 Spring MVC 的流程并映射到相应的控制器执行处理
  - `get`: 声明发送一个 get 请求的方法
  - `param`: 添加 request 的参数，例如发送请求的时候带上了 pcode = root 的参数。
  - `andExpect`: 添加 ResultMatcher 验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）
  - `andDo`: 添加 ResultHandler 结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）
  - `andReturn`: 最后返回相应的 MvcResult，然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）

## 5. 默认的 pom(2.2.7) 和不依赖父级依赖的 pom(2.2.4) 配置写法

  - `dependencies`即使在子项目中不写该依赖项，那么子项目仍然会从父项目中继承该依赖项（全部继承）
  - `dependencyManagement`里只是声明依赖，并不实现引入，因此子项目需要显示的声明需要用的依赖。如果不在子项目中声明依赖，是不会从父项目中继承下来的；只有在子项目中写了该依赖项，并且没有指定具体版本，才会从父项目中继承该项，并且version和scope都读取自父pom;另外如果子项目中指定了版本号，那么会使用子项目中指定的jar版本
