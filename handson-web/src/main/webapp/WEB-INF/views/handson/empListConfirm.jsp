<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>社員一覧表示画面</title>
</head>
<body>
    <h1>Hello 社員一覧画面</h1>

    <table>
        <thead>
            <tr>
                <th>社員ID</th>
                <th>社員名</th>
                <th>マネージャ</th>
                <th>入社日</th>
                <th>給与</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="empInfo" items="${empInfoList}">
                <tr>
                    <td><c:out value="${empInfo.empId}" /></td>
                    <td><c:out value="${empInfo.ename}" /></td>
                    <td><c:out value="${empInfo.mgrName}" /></td>
                    <td><fmt:formatDate value="${empInfo.hiredDate}" pattern="yyyy-MM-dd" /></td>
                    <td><fmt:formatNumber value="${empInfo.sal}" type="CURRENCY" currencySymbol="￥"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>