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
    <title>��������</title>
</head>
<body>
    <h3>��������</h3>
    <form action="doRegister.jsp" method="post">
        <table>
            <tr>
                <td>�û���</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>�ǳ�</td>
                <td><input type="text" name="usernick"></td>
            </tr>
            <tr>
                <td>����</td>
                <td><input type="password" name="password">���벻������6λ</td>
            </tr>
            <tr>
                <td>�Ա�</td>
                <td><input type="radio" name="sex" value="��">��
                    <input type="radio" name="sex" value="Ů">Ů</td>
            </tr>
            <tr>
                <td>ǩ��</td>
                <td><input type="text" name="sign"></td>
            </tr>
            <tr>
                <td>����</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>ƫ��</td>
                <td><input type="checkbox" name="checkbox1" value="Database">���ݿ�
                    <input type="checkbox" name="checkbox1" value="OperatingSystem">����ϵͳ
                    <input type="checkbox" name="checkbox1" value="SoftwareEngineering">�������
                    <input type="checkbox" name="checkbox1" value="Object-Oriented">�������
                    <input type="checkbox" name="checkbox1" value="ComputerNetwork">���������</td>
            </tr>
            <tr>
                <td><input type="submit" value="����"></td>
                <td><input type="reset" value="ȡ��"></td>
            </tr>
        </table>
    </form>
</body>
</html>