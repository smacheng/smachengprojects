<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<jsp:include
	page="/WEB-INF/views/portal/common/smacheng_head_and_css.jsp" />
</head>
<body>

	<div class="container" id="main">
		<jsp:include page="/WEB-INF/views/portal/common/smachengheader.jsp" />
		<section>
			<div class="register-box">
				<div class="register-title text-center">
					<h1>
						<small>注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;册</small>
					</h1>
				</div>
				<div class="register-content ">
					<div class="form">

						<form action="<%=request.getContextPath()%>/register/submit" method="post">
							<div class="form-group">
								<div class="col-xs-12  ">
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-user"></span>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱</span>
										<input type="text" id="email" name="email"
											class="form-control" placeholder="邮箱">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-xs-12  ">
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-user"></span>用&nbsp;&nbsp;户&nbsp;名</span>
										<input type="text" id="username" name="username"
											class="form-control" placeholder="用户名">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-xs-12  ">
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-user"></span>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</span>
										<input type="password" id="password" name="password"
											class="form-control" placeholder="密码">
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="col-xs-12  ">
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-lock"></span>确认密码</span> <input
											type="password" id="confirmpassword" name="confirmpassword"
											class="form-control" placeholder="确认密码">
									</div>
								</div>
							</div>
							<div class="form-group form-actions">
								<div class="col-xs-4 col-xs-offset-4 ">
									<!-- <button type="submit" class="btn btn-sm btn-info">
										<span class="glyphicon glyphicon-off"></span> 注册
									</button> -->
									<button type="submit" class="btn btn-sm btn-success pull-right text-uc m-t-n-xs"><strong>注册</strong></button>
								</div>
							</div>
							<!-- <div class="form-group">
								<div class="col-xs-6 link">
									<p class="text-center remove-margin">
										<small>忘记密码？</small> <a href="javascript:void(0)"><small>找回</small></a>
										<small>还没注册?</small> <a href="javascript:void(0)"><small>注册</small></a>
									</p>
								</div>
							</div> -->
						</form>
						

					</div>
				</div>
			</div>
		</section>
		<%-- <jsp:include page="/WEB-INF/views/portal/common/smacheng_foot_and_css.jsp" />
		<jsp:include page="/WEB-INF/views/portal/common/smachengfooter.jsp" /> --%>
	</div>
	<!-- main close -->
</body>

</html>
