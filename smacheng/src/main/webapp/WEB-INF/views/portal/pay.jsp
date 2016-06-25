<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include
	page="/WEB-INF/views/portal/common/smacheng_head_and_css.jsp" />
</head>
<body>
	<div class="container" id="main" style="color:hotpink;">
		<jsp:include page="/WEB-INF/views/portal/common/smachengheader.jsp" />
		<section id="pay" >
			<div class="container">
				<div class="row">
					<div class="col-md-1"></div>
					<div class="col-md-10">
						<br>
						<br>
						<br>
						<h2 style="color:blue;aline:center;">加入本站永久会员,立即享有本站所有资源！！！</h2><br/>
						<h3>
						
						1.支付宝:<br/>
						&ensp;&ensp;&ensp;&ensp;1)支付宝扫码支付：<img src="<%=request.getContextPath()%>/images/zhifubaopay.png" alt="支付宝支付" width="163" height="165"><br><br><br>
						&ensp;&ensp;&ensp;&ensp;2)转账支付:<br><br>
						&ensp;&ensp;&ensp;&ensp;支付宝账号:2470350983@qq.com  收款人：龚强<br/>
						<br><br>
						2.微信付款:<br/>
						&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;微信扫码支付：<img src="<%=request.getContextPath()%>/images/weixinpay.png" alt="支付宝支付" width="163" height="174">
						</h3>
						
						<br>
					</div>
					<div class="col-md-1">
						<!--<h3>微信扫码</h3><h3>关注有礼!</h3><br/><img src="images/wxgzh.png" alt="mutelink"/>-->
					</div>
				</div>
			</div>

		</section>
		<jsp:include
			page="/WEB-INF/views/portal/common/smacheng_foot_and_css.jsp" />
		<jsp:include page="/WEB-INF/views/portal/common/smachengfooter.jsp" />
	</div>
	<!-- main close -->
</body>

</html>