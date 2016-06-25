<%-- 
    Document   : header
    Created on : 2015-8-20, 21:14:35
    Author     : youyou
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header id="header" class="navbar navbar-fixed-top">
    <div class="container">
        <div>
            <a id="logo" class="navbar-brand" href="<%=request.getContextPath()%>/">
                <img src="<%=request.getContextPath()%>/images/logo.png">
                <strong class="text-white">smacheng</strong>
            </a>
        </div>
       
        <c:if test="${appBean.features.enableLogin}">
            <c:choose>
                <c:when test="${appBean.getCurrentUser() != null}">
                    <div class="navbar-right ">
                        <ul class="nav navbar-nav nav-user user">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle bg clear" data-toggle="dropdown">
                                    <span class="thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm">
                                        <img src="<%=request.getContextPath()%>/assets/images/user.jpg" alt="...">
                                    </span>
                                    ${appBean.getCurrentUser().username} <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu animated fadeInRight">            
                                    <li>
                                        <span class="arrow top"></span>
                                        <a href="<%=request.getContextPath()%>/member/settings/account">设置</a>
                                    </li>
                                    <li>
                                        <a href="<%=request.getContextPath()%>/member/profile">个人资料</a>
                                    </li>
                                    <!--                                <li>
                                                                        <a href="<%=request.getContextPath()%>/member/photos/album">
                                                                            我的相册
                                                                        </a>
                                                                    </li>-->
                                    <li>
                                        <a href="<%=request.getContextPath()%>/member/favorite">收藏</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="<%=request.getContextPath()%>/logout">注销登录</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>  
                </c:when>
                <c:otherwise>
                    <div class="navbar-right ">
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="<%=request.getContextPath()%>/login">
                                    <i class="fa fa-user"></i>
                                    登录
                                </a>
                            </li>
                            <li>
                                <a href="<%=request.getContextPath()%>/register" >
                                    <i class="icon-user-follow"></i>
                                    注册
                                </a>
                            </li>
                        </ul>
                    </div>  
                </c:otherwise>
            </c:choose> 
        </c:if>
       

    </div>
</header>
