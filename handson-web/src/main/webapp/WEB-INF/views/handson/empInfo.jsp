<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>社員情報確認画面</title>
</head>
<body>
    <h1>Hello 社員情報確認画面</h1>

    <form:form modelAttribute="empEditForm" action="${pageContext.request.contextPath}/empEdit?empId=${empInfo.empId}">
        <form:button>社員情報編集</form:button>
    </form:form>

    <table>
        <tbody>
            <tr>
                <td>社員ID</td>
                <td><c:out value="${empInfo.empId}" /></td>
            </tr>
            <tr>
                <td>社員名</td>
                <td><c:out value="${empInfo.ename}" /></td>
            </tr>
            <tr>
                <td>マネージャ</td>
                <td><c:out value="${empInfo.mgrName}" /></td>
            </tr>
            <tr>
                <td>部署</td>
                <td><c:out value="${empInfo.dname}" /></td>
            </tr>
            <tr>
                <td>役職</td>
                <td><c:out value="${empInfo.jname}" /></td>
            </tr>
            <tr>
                <td>雇用日</td>
                <td><fmt:formatDate value="${empInfo.hiredDate}" pattern="yyyy-MM-dd" /></td>
            </tr>
            <tr>
                <td>給与</td>
                <td><fmt:formatNumber value="${f:h(empInfo.sal)}" type="CURRENCY" currencySymbol="￥"/></td>
            </tr>
        </tbody>
    </table>
</body>
</html>