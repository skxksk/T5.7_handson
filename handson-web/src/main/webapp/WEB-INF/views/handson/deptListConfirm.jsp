<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>部署一覧表示画面</title>
</head>
<body>
    <h1>Hello 部署画面</h1>

    <table>
        <thead>
            <tr>
                <th>部署ID</th>
                <th>部署名</th>
                <th>所在地</th>
                <th>作成日</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dept" items="${deptList}">
                <tr>
                    <td><c:out value="${dept.deptId}" /></td>
                    <td><c:out value="${dept.dname}" /></td>
                    <td><c:out value="${dept.loc}" /></td>
                    <td><fmt:formatDate value="${dept.createdAt}" pattern="yyyy-MM-dd" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>