<%-- 
    Document   : footer 
    描述:共有的js组件  jquey和boostrap ace的
    Created on : 2015-5-22, 21:03:31
    Author     : youyou
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='<%=request.getContextPath()%>/js/jquery.min.js'>" + "<" + "/script>");</script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
window.jQuery || document.write("<script src='<%=request.getContextPath()%>/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement)
        document.write("<script src='<%=request.getContextPath()%>/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");</script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<!-- ace scripts -->
<script src="<%=request.getContextPath()%>/js/ace-elements.min.js"></script>
<script src="<%=request.getContextPath()%>/js/ace.min.js"></script>

<!--这是用来控制菜单选中后高亮的
<script src="<%=request.getContextPath()%>/js/mycommon/common.js" type="text/javascript"></script>-->
