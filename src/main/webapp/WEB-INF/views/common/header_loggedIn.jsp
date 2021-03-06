<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/url.jsp" %>
<div class="align-end head" style="position: fixed; width: 86;">
	<div class="col-md-7">
		<img id="logo" alt="" src="${logo}" height="100">
	</div>
	<div class="j-end align-end f-1" style="margin-bottom: 15px;">
		<div class="align-end pd-3">
			<a href="${_notice}/list.do" class="btn btn-link" style="margin-right: 15px;"><strong>공지사항</strong></a>		
			
			<div class="btn-group">
				<button class="btn btn-link dropdown-toggle" data-toggle="dropdown">
					<c:if test="${sessionScope.member.picture != 'noFile' }">
						<img alt="" src="${_profile}/${sessionScope.member.picture}" class="img-circle" height="42" width="42">
					</c:if>
				</button>
				<ul class="dropdown-menu" role="menu" style="position: fixed; top: 13.2%; left: 85%">
					<li><a href="${_myPage}/main.do">마이페이지</a></li>
					<li class="divider"></li>
					<li><a href="${_member}/logout.do">로그아웃</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>