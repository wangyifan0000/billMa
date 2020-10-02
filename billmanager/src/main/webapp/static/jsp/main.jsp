<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/" method="post">
    <table border="1px">
        <tr>
            <td>记账管理</td>
        </tr>
        <tr>
            <td><select name="type">
                <option value="0">不限</option>
                <option value="1">支出</option>
                <option value="2">收入</option>
                <option value="3">转账</option>
                <option value="4">借出</option>
                <option value="5">借入</option>
                <option value="6">还入</option>
                <option value="7">还出</option>
            </select></td>
            <td>时间从:<input type="text" name="datestart">到<input type="text" name="dateend"></td>
            <td><input type="submit" value="搜索"></td>
            <td><input type="button" value="记账" onclick="add()"></td>


        </tr>
        <tr>
            <td>标题</td>
            <td>记账时间</td>
            <td>类别</td>
            <td>金额</td>
            <td>说明</td>

        </tr>
        <c:forEach var="bill" items="${pageInfo.list}">
            <tr>
                <td><c:if test="${bill.title}==1">支出</c:if>
                    <c:if test="${bill.title}==2">收入</c:if>
                    <c:if test="${bill.title}==3">转账</c:if>
                    <c:if test="${bill.title}==4">借出</c:if>
                    <c:if test="${bill.title}==5">借入</c:if>
                    <c:if test="${bill.title}==6">还入</c:if>
                    <c:if test="${bill.title}==7">还出</c:if>
                </td>
                <td><fmt:formatDate value="${bill.bibleTime}" pattern="yyyy-MM-dd"/></td>
                <td>${bill.typeName}</td>
                <td>${bill.price}</td>
                <td>${bill.explian}
                </td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</form>
<script>
    $(function () {
        $("tr:odd").css("background-color", "gray");
    })

    function add() {

        location.href = "/doAdd";
    }
</script>
</body>
</html>
