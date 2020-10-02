<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/insertBill" method="post">
    <table border="1px">
        <tr>
            <td style="text-align: center">记账管理</td>
        </tr>
        <tr>
            <td>类型<input type="radio" name="type" value="支入">
                <input type="radio" name="type" value="支出">
                <input type="radio" name="type" value="转账">
                <input type="radio" name="type" value="借入">
                <input type="radio" name="type" value="借出">
                <input type="radio" name="type" value="还入">
                <input type="radio" name="type" value="还出">
            </td>
        </tr>
        <tr>
            <td>标题<input type="text" name="title"></td>
        </tr>
        <tr>
            <td>日期<input type="text" name="date"></td>
        </tr>
        <tr>
            <td>金额<input type="text" name="price"></td>
        </tr>
        <tr>
            <td>说明<input type="text" name="explian"></td>
        </tr>
        <tr>
            <td><input type="submit" value="保存"><input type="button" onclick="reback()" value="重置">
                <input type="button" value="返回" onclick="fanhui()">
            </td>
        </tr>
    </table>
</form>
<script>
    $("form").submit(function () {
        var type = $("[name='type']").val();
        var title = $("[name='title']").val();
        var date = $("[name='date']").val();
        var price = $("[name='price']").val();
        var explian = $("[name='explian']").val();
        if (type == "") {
            alert("类别不能为空");
            return false;
        }
        if (title == "") {
            alert("标题不能为空");
            return false;
        }
        if (date == "") {
            alert("请填写考勤日期");
            return false;
        }

        if (price == "") {
            alert("请选取价格");
            return false;
        }
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        if (!date.match(reg)) {
            alert("时间格式不正确!!!");
            return false;
        }
        if (explian == "") {
            alert("请选取说明");
            return false;
        }
    })

    function reback() {
        $("[name='type']").val("");
    }
    function fanhui() {
        location.href="/"
    }
</script>
</body>
</html>
