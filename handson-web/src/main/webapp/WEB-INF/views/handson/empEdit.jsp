<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>社員情報編集画面</title>
<script type="text/javascript">

function selectMgr(){

    const deptId = document.querySelector('#deptId').value;
    const jobId = document.querySelector('#jobId').value;
    const url = "${pageContext.request.contextPath}/mgr?deptId=" + deptId + "&jobId=" + jobId;

    window.open(url, "マネージャ選択画面", "width=400,height=500,scrollbars=no");
}

</script>
</head>
<body>
    <h1>Hello 社員情報編集画面</h1>

    <form:form modelAttribute="empEditForm" action="${pageContext.request.contextPath}/empConfirm">
    <table>
        <tbody>
            <tr>
                <td>社員ID</td>
                <td><form:input path="empId" disabled="true"/></td>
            </tr>
            <tr>
                <td>社員名</td>
                <td><form:input path="ename" /></td>
            </tr>
            <tr>
                <td>部署</td>
                <td>
                    <%-- <form:select path="empEditForm.deptId" items="${CL_DEPT}" /> --%>
                    <form:select path="deptId">
                        <form:option value="">--部署--</form:option>
                        <form:options items="${CL_DEPT}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>役職</td>
                <td>
                    <form:select path="jobId">
                        <form:option value="">--役職--</form:option>
                        <form:options items="${CL_JOB}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>マネージャ</td>
                <td>
                    <form:input path="mgr" readonly="true"/>
                    <form:input path="mgrName" disabled="true"/>
                    <a href="#" onclick="selectMgr();">選択</a>
                </td>
            </tr>
            <tr>
                <td>雇用日</td>
                <td><input type="date" id="hiredDate" name="hiredDate" value="<fmt:formatDate value="${empEditForm.hiredDate}" pattern="yyyy-MM-dd" />"></td>
            </tr>
            <tr>
                <td>給与</td>
                <td><form:input path="sal" /></td>
            </tr>
        </tbody>
    </table>
    <%-- <form:button>確認</form:button> --%>
    </form:form>
</body>
</html>