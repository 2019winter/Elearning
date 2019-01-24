<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/1/23
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件下载测试</title>
</head>
<body>
<% out.print(get_file_a("1","下载此文件"));%>
<% out.print(get_file_a("123456","下载不存在文件"));%>
</body>
<%--jsp--%>
<%!
String get_file_a(String fid,String fname){
    return "<a href=\"javascript:filedownload('"+fid+"');\">"+fname+"</a>";
}
%>
<%//获取服务器根目录
    String tpath = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+tpath+"/";
%>
<%--js--%>
<script>
    //文件下载后台url
    var filedl_url=<%out.print("\""+basePath+"\"");%>+"filedl";
    function filedownload(fid){
        // alert("<<<<<<<<<1>>>>>>>>>>>>>");///////////////////
        var tempform = document.createElement("form");
        tempform.action =filedl_url;
        tempform.method = "post";
        tempform.style.display = "none";
        var opt1 = document.createElement("input");
        opt1.name ="fid";
        opt1.value =fid;
        tempform.appendChild(opt1);
        var opt2 = document.createElement("input");
        opt2.name ="uid";
        opt2.value =getCookie("1");//uid  Cookie名
        tempform.appendChild(opt2);
        document.body.appendChild(tempform);
        tempform.submit();
    }
    function getCookie(c_name)//得到Cookie
    {
        ////////////////待删除
        if(1+1==2){
            return c_name;
        }
        //////////////////////
        if (document.cookie.length>0)
        {
            var c_start=document.cookie.indexOf(c_name + "=");
            if (c_start!=-1)
            {
                c_start=c_start + c_name.length+1 ;
                c_end=document.cookie.indexOf(";",c_start);
                if (c_end==-1) c_end=document.cookie.length;
                return decodeURI(unescape(document.cookie.substring(c_start,c_end)));//中文cookie会乱码，php写人的内容用urlencode()编码，后自动cookie编码，js获取数据先cookie解码得到url编码，再decodeURI()解码可得不乱码中文
            }
        }
        return "";
    }
</script>

</html>
