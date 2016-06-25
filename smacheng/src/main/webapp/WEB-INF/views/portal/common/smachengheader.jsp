<%-- 
    Document   : navbar
    Created on : 2015-11-6, 23:47:01
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!-- nav start-->
<div class="navbar navbar-fixed-top navbar-inverse" id="topnav">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<a class="navbar-brand" href="#"><img src="<%=request.getContextPath()%>/images/logo.png" alt="smacheng" width="120" height="49"></a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="<%=request.getContextPath()%>/" style="color:red;" onmouseover="this.style.color = 'hotpink'" onmouseout="this.style.color='red'">首页</a></li>
				<!-- <li class="dropdown" id="accountmenu">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">近期关注<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">响应式布局</a></li>
						<li><a href="#">阿里云ECS</a></li>
						<li class="divider"></li>
						<li><a href="#">第三方登录</a></li>
						<li><a href="#">视频直播</a></li>
					</ul>
				</li> -->
				<li><a href="<%=request.getContextPath()%>/vip">VIP资源</a></li>
				<li><a href="http://pan.baidu.com/s/1c192OJA#path=%252F%25E5%2585%25AC%25E5%2585%25B1%25E5%258C%25BA" target="_blank">公共区</a></li>
				<li><a href="<%=request.getContextPath()%>/pay">付款加入</a></li>
				<!-- <li class="dropdown" id="accountmenu">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">精品资源<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">LinkTop</a></li>
						<li><a href="#">阿里云ECS</a></li>
						<li class="divider"></li>
						<li><a href="#">第三方登录</a></li>
						<li><a href="#">视频直播</a></li>
					</ul>
				</li>
				
				<li class="dropdown" id="accountmenu">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">在线服务<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">响应式布局</a></li>
						<li><a href="#">阿里云ECS</a></li>
						<li class="divider"></li>
						<li><a href="#">第三方登录</a></li>
						<li><a href="#">视频直播</a></li>
					</ul>
				</li> -->
			</ul>
			 
			<%-- <c:choose>
			    <c:when test="${not empty loginmember}"> 
			          <div class="navbar-right ">
			                        <ul class="nav navbar-nav navbar-right ng-scope" ng-controller="user_ctrl" id="header_me">
										<li style="color:red;">欢迎<%=session.getAttribute("loginmember")%>光临本站</li>
									</ul>
			          </div>   
			   </c:when>
			    <c:otherwise>
			       <div class="navbar-right ">
                        <ul class="nav navbar-nav navbar-right ng-scope" ng-controller="user_ctrl" id="header_me">
							<li><a href="<%=request.getContextPath()%>/login"><i class="fa fa-user"></i>&nbsp;登录</a></li>
							<li><a href="<%=request.getContextPath()%>/register"><i class="fa fa-user-plus" aria-hidden="true"></i>&nbsp;注册</a></li>
						</ul>
                    </div>  
			    </c:otherwise>
			</c:choose> --%>
			 <c:if test="${appBean.features.enableLogin}">
            	<c:choose>
                <c:when test="${appBean.getCurrentUser() != null}">
                    <div class="navbar-right ">
                        <ul class="nav navbar-nav nav-user user">
                             <li class="dropdown">
                                <a href="#" class="dropdown-toggle bg clear" data-toggle="dropdown">
                                   <%--  <span class="thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm">
                                     <img src="<%=request.getContextPath()%>/images/usericon.png" alt="ok"> --%>
                                        <%-- <img src="<%=request.getContextPath()%>/assets/images/user.jpg" alt="..."> --%>
                                       
                                    </span>${appBean.getCurrentUser().username}<b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu animated fadeInRight">            
                                   <%--  <li>
                                        <span class="arrow top"></span>
                                        <a href="<%=request.getContextPath()%>/member/settings/account">设置</a>
                                    </li>
                                    <li>
                                        <a href="<%=request.getContextPath()%>/member/profile">个人资料</a>
                                    </li>
                                  <li>
                                                                        <a href="<%=request.getContextPath()%>/member/photos/album">
                                                                            我的相册
                                                                        </a>
                                                                    </li>
                                                                      <!--                                -->
                                    <li>
                                        <a href="<%=request.getContextPath()%>/member/favorite">收藏</a>
                                    </li>
                                    <li class="divider"></li> --%>
                                    <li>
                                        <a href="<%=request.getContextPath()%>/logout">注销登录</a>
                                    </li>
                                </ul>
                            </li>
                            <%-- <li><a href="<%=request.getContextPath()%>/sponsor" style="color:yellow;">赞助本站<img src="<%=request.getContextPath()%>/images/yen_coin.png" alt="赞助本站"></a></li> --%>
                        </ul>
                    </div>  
                </c:when>
                <c:otherwise>
                    <div class="navbar-right ">
                        <ul class="nav navbar-nav navbar-right ng-scope" ng-controller="user_ctrl" id="header_me">
							<li id="qqControllogin" style="display:block;"><a href="<%=request.getContextPath()%>/login"><i class="fa fa-user"></i>&nbsp;登录</a></li>
							<li id="qqControlregister"><a href="<%=request.getContextPath()%>/register"><i class="fa fa-user-plus" aria-hidden="true"></i>&nbsp;注册</a></li>
							<%-- 
							<li><a href="<%=request.getContextPath()%>/sponsor" style="color:yellow;">赞助本站<img src="<%=request.getContextPath()%>/images/yen_coin.png" alt="赞助本站" width="40" height="40"></a>
							 --%>
							<li>
								<div style="color:red;">
									<span id="qqLoginBtn" style="color:red;"></span>
									<script type="text/javascript">
										QC.Login({
											btnId:"qqLoginBtn"	//插入按钮的节点id
										});
									</script>
									
									<script type="text/javascript">
										var paras = {};
										QC.api("get_user_info", paras).success(function(s){//成功回调
											// alert(s.data+"获取用户信息成功！当前用户昵称为："+s.data.nickname);
											// $("#mmmm").show();
											$("#qqControllogin").hide();
											$("#qqControlregister").hide();
										   }).error(function(f){//失败回调
											// alert("获取用户信息失败！");
											   alert("qq登录失败！");
										   }).complete(function(c){//完成请求回调
										     // alert("获取用户信息完成！");
									    });
										var paras = {content : "#http://www.51jisuonline.com#<--神码城"};
										QC.api("add_t", paras)
											.success(function(s){//成功回调
												//alert("发送微博成功，请到腾讯微博内查看！");
											})
											.error(function(f){//失败回调
												//alert("发送微博失败！");
											})
											.complete(function(c){//完成请求回调
												//alert("发送微博完成！");
											});
										</script>
								</script>
					</div>
							</li>
						</ul>
                    </div>  
                    
                </c:otherwise>
            </c:choose> 
        </c:if> <%--  --%>
		<%-- <ul class="nav navbar-nav navbar-right ng-scope" ng-controller="user_ctrl" id="header_me">
				<li><a href="<%=request.getContextPath()%>/login"><i class="fa fa-user"></i>&nbsp;登录</a></li>
				<li><a href="<%=request.getContextPath()%>/register"><i class="fa fa-user-plus" aria-hidden="true"></i>&nbsp;注册</a></li>
		</ul> --%>
		</div>
	</div>
</div>
<!-- nav end-->