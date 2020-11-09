<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
	testing page
	<hr/>
	<table>
	<!--
	int product_id;
	String product_name;
	int product_price;
	int product_quantity;
	String product_desc;
	-->
		<thead>
			test_chart
		</thead>
		<tbody>
			<th>
				<td>상품번호</td>
				<td>상품명</td>
				<td>상품가격</td>
				<td>상품수량</td>
				<td>상품설명</td>
			</th>
			<c:forEach var="product" items="${ products }">
				<tr>
					<td>${ product.product_id }</td>
					<td>${ product.product_name }</td>
					<td>${ product.product_price }</td>
					<td>${ product.product_quantity }</td>
					<td>${ product.product_desc }</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>good</tfoot>
	</table>
</body>
</html>