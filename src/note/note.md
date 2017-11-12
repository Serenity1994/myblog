## 启动项目时报错:
```严重: One or more listeners failed to start. Full details will be found in the appropriate container log file
   严重: Context [/myblog] startup failed due to previous errors
   严重: The web application [/myblog] registered the JDBC driver [com.mysql.cj.jdbc.Driver] but failed to unregister it when the web application was stopped. To prevent a memory leak, the JDBC Driver has been forcibly unregistered.
```
* 原因:mysql没有启动
* 解决方法:添加mysql开机启动.
  linuxmint:首选项 -> 开机自启动程序 -> 添加 -> 自定义命令 -> 命令:`sudo service mysql start`
  
## javadoc生成api
* idea下操作:
>使用`ctrl`+`shift`+`A`查找到`generate javadoc`填写相关内容后点击确定即可
* 生成的html乱码解决方法:
 `other conmand line arguments`输入框中添加:`-encoding UTF-8 -charset UTF-8`

## 启动时报错:
```
java.lang.Class cannot be cast to java.lang.reflect.ParameterizedType
```
* 原因:
BaseDaoImpl.java类上添加了注解:`@Component`
* 解决办法:删除该注解