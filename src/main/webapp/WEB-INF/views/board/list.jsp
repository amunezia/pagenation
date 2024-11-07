<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<jsp:include page="../include/header.jsp" flush="false"/>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">목록</h1>
<table class="table">
<colgroup>
<col style="width:5%"/>
<col style="width:60%"/>
<col style="width:20%"/>
<col style="width:10%"/>
<col style="width:5%"/>
</colgroup>
<thead>
<tr>
<th class="text-center">번호</th><th class="text-center">제목</th><th class="text-center">작성일</th><th class="text-center">작성자</th><th class="text-center">조회수</th>
</tr>
</thead>
<tbody>
<c:forEach items="${pagelist}" var="pagelist">
 <tr>
  <td class="text-center">${pagelist.bno}</td>
  <td><a href="/board/view?bno=${pagelist.bno} ">${pagelist.btitle}</a></td>
  <td class="text-center">${pagelist.bdate}</td>
  <td class="text-center">${pagelist.bview}</td>
  <td class="text-center">${pagelist.bchu}</td>
 </tr>
</c:forEach>
</tbody>
</table>
<div class="d-flex justify-content-end my-5">
<a href="/board/write" class="btn btn-outline-primary">Write</a>

</div>
</div>
</div>
</div>
<jsp:include page="../include/footer.jsp" flush="false"/>