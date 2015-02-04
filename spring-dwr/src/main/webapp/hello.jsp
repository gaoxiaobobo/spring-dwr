<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'hello.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<!-- 记得引入js，测试地址： http://localhost:8083/dwrweb/dwr/ -->
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
<script type="text/javascript" src="dwr/interface/helloSrv.js"></script>
<script type="text/javascript">
    function hello(){
        //方法一
        //返回处理后的结果信息
        /*var fn = function(result){
         $("msg").innerHTML = result;
         }
         helloSrv.sayHello($("name").value, fn);*/

        //方法二
        helloSrv.sayHello($("name").value, function(result){
            $("msg").innerHTML=result;
        });

        //方法三
        //使用如下的好处为：不用导入如上三个js
        //第一个参数: dwr访问路径，在web.xml中配置，如： <url-pattern>/dwr/*</url-pattern>
        //第二个参数: dwr与java服务器通信变量，在dwr.xml中声明
        //第三个参数: 服务器方法名
        //第四个参数: 页面请求参数，即服务器方法名得参数
        //第五个参数: 回调函数
        //dwr.engine._execute("dwr", 'helloSrv', 'sayHello', $("name").value, fn);

    }
</script>
<body>
<div id="msg"></div>
<input type="text" id="name" />
<input type="button" value="Hello" onclick="hello();" />
</body>
</html>