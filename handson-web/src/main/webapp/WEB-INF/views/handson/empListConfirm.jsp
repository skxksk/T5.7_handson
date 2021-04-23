<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>社員一覧表示画面</title>
</head>
<body>
    <h1>Hello 社員一覧画面</h1>

<%--     <form:form
        action="${pageContext.request.contextPath}/newEmp"
        method="post">
        modelAttribute="todoForm"
        cssClass="inline"

        <form:button>社員情報新規登録</form:button>
    </form:form> --%>
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
                    <td><fmt:formatNumber value="${f:h(empInfo.sal)}" type="CURRENCY" currencySymbol="￥"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>