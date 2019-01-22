<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/21
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
    <h3>个人中心</h3>
    <form action="doRegister.jsp" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>昵称</td>
                <td><input type="text" name="usernick"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password">密码不得少于6位</td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="sex" value="男">男
                    <input type="radio" name="sex" value="女">女</td>
            </tr>
            <tr>
                <td>签名</td>
                <td><input type="text" name="sign"></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>偏好</td>
                <td><input type="checkbox" name="checkbox1" value="Database">数据库
                    <input type="checkbox" name="checkbox1" value="OperatingSystem">操作系统
                    <input type="checkbox" name="checkbox1" value="SoftwareEngineering">软件工程
                    <input type="checkbox" name="checkbox1" value="Object-Oriented">面向对象
                    <input type="checkbox" name="checkbox1" value="ComputerNetwork">计算机网络</td>
            </tr>
            <tr>
                <td><input type="submit" value="保存"></td>
                <td><input type="reset" value="取消"></td>
            </tr>
        </table>
    </form>
</body>
</html>