<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/WEB-INF/views/portal/common/smacheng_head_and_css.jsp"/>
</head>
<body>

	<div class="container" id="main">
		<jsp:include page="/WEB-INF/views/portal/common/smachengheader.jsp"/>
		<section id="home">
		<!---header-->
           <%--  <jsp:include page="/WEB-INF/views/portal/common/smachengloginheader.jsp"/> --%>
            <!---header //END-->
			<div class="container">
				<div class="row">
					<div class="col-md-1"></div>
					<div class="col-md-10">
					
						<div id="homeheader" class="header">
							<hgroup class="header_hgroup">
								<center>
									<h2 class="header_title">
									<a href="#" rel="home">公共区免费视频</a>
								</h2>
								</center>
								
								<h2 id="site-description">
									<div id="typed-strings">
<p>&emsp;&emsp;1.前端：UI设计教程、干货,Html5,CSS3,NODEJS,EasyUI,JavaScript等等众多和前端相关的各种视频教程。
<br/><br/>&emsp;&emsp;2.Java区:涵盖了java的方方面面,对于Java语言来说,完全可以帮助个人从零到Java中级水平。
<br/><br/>&emsp;&emsp;3.Linux：从入门到熟练掌握各种Linux命令用法。
<br/><br/>&emsp;&emsp;4.提供了各种操作系统ISO安装文件。
<br/><br/>&emsp;&emsp;5.Android开发,提供google官方最新的的Android-Studio教程及其各种Demo。
<br/><br/>&emsp;&emsp;大家可以从导航栏菜单公共区直接点击进行下载。
<br/><br/>&emsp;&emsp;-----希----望----大----家----喜----欢----。
<br/><br/>&emsp;&emsp;---------------------------------------------------------smacheng制作。
</p>
						</div>
						<span id="typed"></span>
								</h2>
							</hgroup>
						</div> <!--  -->
						<br /><br />
						
					</div>
					<div class="col-md-1"><!--<h3>微信扫码</h3><h3>关注有礼!</h3><br/><img src="images/wxgzh.png" alt="mutelink"/>--></div>
				</div>
			</div>
			
		</section>
		<jsp:include page="/WEB-INF/views/portal/common/smacheng_foot_and_css.jsp"/>
		<jsp:include page="/WEB-INF/views/portal/common/smachengfooter.jsp"/>
	</div>
	<!-- main close -->
</body>

</html>