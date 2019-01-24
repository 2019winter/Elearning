package cn.java.controller.front;

import cn.java.entity.Action;
import cn.java.entity.Course;
import cn.java.entity.User;
import cn.java.service.impl.ActionServiceImpl;
import cn.java.service.impl.CourseServiceImpl;
import cn.java.service.impl.FileServiceImpl;
import cn.java.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.soap.Addressing;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.AttributedString;
import java.util.Date;

import cn.java.entity.File;

/**************************说明***************************
 *由于需要记录下载文件行为，且需要判断用户是否登录后提供下载，需要用户ID(uid)
 * 这里使用js查询cookie，以post方式传参fid(文件id)、uid
 * 所有文件超链接要用如下方法，以输出类似超链接：<a href="javascript:filedownload(fid);" >文件</a>
 function get_file_a(fid);
 *jsp文件要加如下几个方法，一个jsp方法用来输出超链接，另一个javascript方法模拟post提交fid和uid
 //加jsp代码段
 <%!
 String get_file_a(String fid,String fname){
 return "<a href=\"javascript:filedownload('"+fid+"');\">"+fname+"</a>";
 }
 %>
 <%//获取服务器根目录
 String tpath = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+tpath+"/";
 %>
 *每次需要文件下载链接，加
 <% out.print(get_file_a("fileDowntest","下载此文件"));%>
 *
 //加js代码段
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
 opt2.value =getCookie("123");//uid  Cookie名
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

 ***********************************************************/
@Controller
public class FileDownload {
    //数据库信息
//    private String mysql_host;
//    private String mysql_user;
//    private String mysql_password;
//    private String mysql_db;
    @Autowired
    private  FileServiceImpl fileService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ActionServiceImpl actionService;
    //


    @RequestMapping(value="/filedl")
    public String fileDownload(HttpServletRequest request, HttpServletResponse response,Model model) throws UnsupportedEncodingException {
//        System.out.println( "<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<" );//////////////////////
        String fid=request.getParameter("fid");
        String uid=request.getParameter("uid");
        //System.out.println( "uid:"+uid+"  ;  fid:"+fid );/////////////////////
        if(fid==null||uid==null){
            model.addAttribute("ErrorInformation","请先登录");
            return "front/globalException.jsp";
        }
        String file_path="";//文件路径
        String file_name="文件下载测试.txt";
        String file_type="txt";
        //查询数据库
        User user=userService.selectByPrimaryKey(Integer.parseInt(uid));
        if(user==null){
            model.addAttribute("ErrorInformation","用户不存在，请先登录");
            return "front/globalException.jsp";
        }

//        System.out.println( fid+"<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<<"+Integer.parseInt(fid));
        File file=fileService.selectByPrimaryKey(Integer.parseInt(fid));
        //如果查询不成功
        if(file==null||!file.getFileStatus().equals("0")){//文件状态不为“0”也是不存在
            model.addAttribute("ErrorInformation","没有该文件");
            return "front/globalException.jsp";
        }
        //如果查询成功
        file_path=file.getFilePath();
        file_name=file.getFileName();
        file_type=file.getFileType();
//        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/FilesData");//文件存放在/WEB-INF/FilesData/下,fid.*是文件名
//        Path filep = Paths.get(dataDirectory,fid+"."+file_type);//条件：file_types是后缀，不带“.”
        Path filep = Paths.get(file_path);
        if (Files.exists(filep)){
            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename="+
                    java.net.URLEncoder.encode(file_name, "UTF-8"));//response.addHeader设置会中文乱码，要加java.net.URLEncoder.encode(fileName, "UTF-8")
            try {
                Files.copy(filep,response.getOutputStream());
            } catch (IOException ex) {
                model.addAttribute("ErrorInformation","下载出错，请重新下载或联系管理员");
                return "front/globalException.jsp";
            }finally {

            }
        }
        //改变文件下载次数记录
        file.setFileDownloadCount(file.getFileDownloadCount()+1);
        fileService.updateByPrimaryKey(file);
        //增加文件下载行为记录
        Action action=new Action();
        action.setActionDate( new Date() );
        action.setActionType( 1 );//设置行为类型
        action.setActionUser( Integer.parseInt( uid ) );
        action.setActionItem( "filedl" );
        //行为id自增，不知道怎么加入数据库
        actionService.insert( action );
        //增加文件操作记录

        return null;
    }
    /////////////////////////////测试，待删除
    @RequestMapping(value="/test_fileshow")
    public String fileShow(){

        return "front/test_filedownload.jsp";
    }
    /////////////////////////////////////
}

