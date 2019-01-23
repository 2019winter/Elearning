<h2>欢迎来到智库初始工程</h2>
<p></p>
jdk版本：jdk1.8
<p></p>
tomcat版本：8.5.37
<p></p>
IDE工具:IDEA
<p></p>
各类文件请放置至本工程如下位置：
<p></p>
前端页面：web/pages/front
<p></p>
后端页面: web/pages/admin
<p></p>
错误处理页面：web/pages/error
<p></p>
js: web/resources/js
<p></p>
css: web/resources/css
<p></p>
image: web/resources/images
<p></p>
文件上传储存: web/upload
<p></p>
Controller控制器: src/cn/java/controller/admin(front、exception)
<p></p>
Model模型: src/cn/java/entity
<p></p>
Service层接口: src/cn/java/sevice
<p></p>
Service层接口实现: src/cn/java/sevice/impl
<p></p>
Dao层: src/cn/java/mapper
<p></p>
filter: src/cn/java/filters
<p></p>
interceptors: src/cn/java/interceptors
<p></p>
定时器任务: src/cn/java/tasks
<p></p>
工具类: src/cn/java/utils
<p></p>
数据库xml映射文件: resource/mapper
<p></p>
其他尚待补充!
<p></p>

<h2>使用时需要手动修改的地方：</h2>
<p></p>
resource/applicationContext.xml
<p></p>
配置数据源：
<p></p>
1.将smartcool改成自己的数据库的名称
<p></p>
2.将root改成自己的超级用户名称
<p></p>
3.将1mysql改成自己的登录密码
<p></p>

<h2>可能需要改的地方</h2>
<p></p>
resource/springmvc.xml
<p></p>
配置文件上传：
<p></p>
1.最大上传的文件大小设置为了1MB，需要用再改
<p></p>
控制台中文乱码：
<p></p>
1.在Edit Configuration 的VM option加入：-Dfile.encoding=UTF-8（也许有用）
<p></p>

