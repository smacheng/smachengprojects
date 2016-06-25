<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<jsp:include page="/WEB-INF/views/portal/common/smacheng_head_and_css.jsp"/>
</head>
<body>

	<div class="container" id="main">
		<jsp:include page="/WEB-INF/views/portal/common/smachengheader.jsp"/>
		<section>
				<div class="login-box">
					<div class="login-title text-center">
						<h1><small>登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</small></h1>
						<c:if test="${not empty errorMessage}">
                                <div class="alert alert-danger">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    <i class="fa fa-ban-circle"></i><strong>错误信息!</strong>${errorMessage}.
                                </div>
                        </c:if>
                        <c:if test="${empty errorMessage}">
                            <p>登录可以获得更好的服务</p>
                        </c:if>
					</div>
					<div class="login-content ">
					<div class="form">
					<form action="<%=request.getContextPath()%>/login/submit" method="post">
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span class="glyphicon glyphicon-user">用户名</span></span>
									<input type="text" id="username" name="username" class="form-control" placeholder="用户名">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span class="glyphicon glyphicon-lock">密&ensp;&ensp;码</span></span>
									<input type="password" id="password" name="password" class="form-control" placeholder="密码">
								</div>
							</div>
						</div>
						<div class="form-group form-actions">
							<div class="col-xs-4 col-xs-offset-4 ">
								<p class="text-center remove-margin">
									<!-- <button type="submit" class="btn btn-sm btn-info"><span class="glyphicon glyphicon-off"></span> 登录</button> -->
									<button type="submit" class="btn btn-sm btn-success pull-right text-uc m-t-n-xs"><strong>登录</strong></button>
									<!-- <label id="rememberme">
                                        <input type="checkbox" name="rememberme" checked data-required="true" >自动登
                                    </label> -->
								</p>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-6 link">
								<p class="text-center remove-margin" id="fz">
								<small>忘记密码?</small><a href="javascript:void(0)" style="color:red;"><small>找回</small></a><br/>
								<small>还没注册?</small><a href="javascript:void(0)" style="color:red;"><small>注册</small></a>
								</p>
							</div>
						</div>
						
					</form>
					</div>
					
				</div>
			</div>
		</section>
		<%-- <jsp:include page="/WEB-INF/views/portal/common/smacheng_foot_and_css.jsp"/>
		<jsp:include page="/WEB-INF/views/portal/common/smachengfooter.jsp"/> --%>
	</div>
	<!-- main close -->
</body>

</html>
