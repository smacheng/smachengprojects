<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/WEB-INF/views/portal/common/smacheng_head_and_css.jsp" />

<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>

</head>
<body>
	<div class="container" id="main">
		<jsp:include page="/WEB-INF/views/portal/common/smachengheader.jsp" />
		<section id="vip" >
			<div class="container">
				<div class="row">
					<div class="col-md-1"></div>
					<div class="col-md-10">
						<h2 style="color:hotpink">VIP精品资源区</h2><br/>
						<table border="1" align="center" height="100%" width="100%" cellspacing="10" style="border-collapse:separate;border-spacing:10px;background-color:lightblue;">
							<tr>
								<td align="center" width="120px;">nginx</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							<tr>
								<td align="center">dubbo分布式</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							<tr>
								<td align="center">版本控制</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							<tr>
								<td align="center">数据库优化(oracle)</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							<tr>
								<td align="center">数据库优化(mysql)</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							
							<tr>
								<td align="center">大数据</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							
							<tr>
								<td align="center">JVM</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							<tr>
								<td align="center">Android</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							
							<tr>
								<td align="center">IOS</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
							
							<tr>
								<td align="center">前端</td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
								<td align="center"><img src="<%=request.getContextPath()%>/images/nginx.jpg" alt="nginx" width="50" height="50"></td>
							</tr>
						</table>
					</div>
					<div class="col-md-1">
						<!--<h3>微信扫码</h3><h3>关注有礼!</h3><br/><img src="images/wxgzh.png" alt="mutelink"/>-->
					</div>
				</div>
			</div>

		</section>
		<br/>
		<jsp:include
			page="/WEB-INF/views/portal/common/smacheng_foot_and_css.jsp" />
		<jsp:include page="/WEB-INF/views/portal/common/smachengfooter.jsp" />
	</div>
	<!-- main close -->
</body>

</html>