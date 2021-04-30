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
                <td style="width:30%"><form:label path="empId">社員ID</form:label></td>
                <td>
                <form:hidden path="empId" />
                <c:choose>
                  <c:when test="${empty empEditForm.empId}">
                      社員IDは自動生成されます。
                  </c:when>
                  <c:otherwise>
                      <c:out value="${empEditForm.empId}" />
                  </c:otherwise>
                </c:choose>
                </td>
            </tr>
            <tr>
                <td><form:label path="ename">社員名</form:label></td>
                <td>
                    <form:input path="ename" />
                    <form:errors path="ename" cssStyle="color:red" />
                </td>
            </tr>
            <tr>
                <td><form:label path="deptId">部署</form:label></td>
                <td>
                    <%-- <form:select path="empEditForm.deptId" items="${CL_DEPT}" /> --%>
                    <form:select path="deptId">
                        <form:option value="">--部署--</form:option>
                        <form:options items="${CL_DEPT}" />
                    </form:select>
                    <form:errors path="deptId" cssStyle="color:red" />
                </td>
            </tr>
            <tr>
                <td><form:label path="jobId">役職</form:label></td>
                <td>
                    <form:select path="jobId">
                        <form:option value="">--役職--</form:option>
                        <form:options items="${CL_JOB}" />
                    </form:select>
                    <form:errors path="jobId" cssStyle="color:red" />
                </td>
            </tr>
            <tr>
                <td><form:label path="mgr">マネージャ</form:label></td>
                <td>
                    <form:input path="mgr" readonly="true" />
                    <form:input path="mgrName" readonly="true" />
                    <a href="#" onclick="selectMgr();">選択</a>
                    <form:errors path="mgr" cssStyle="color:red" />
                </td>
            </tr>
            <tr>
                <td><form:label path="hiredDate">雇用日</form:label></td>
                <td>
<%--                     <input type="date" id="hiredDate" name="hiredDate"
                            value="<fmt:formatDate value="${empEditForm.hiredDate}" pattern="yyyy-MM-dd" />">
--%>
                    <input type="date" name="hiredDate" value="${empEditForm.hiredDate}" ><c:out value="${empEditForm.hiredDate}" />
                    <form:errors path="hiredDate" cssStyle="color:red" />
                </td>
            </tr>
            <tr>
                <td><form:label path="sal">給与</form:label></td>
                <td>
                    <form:input path="sal" />
                    <form:errors path="sal" cssStyle="color:red" />
                </td>
            </tr>
        </tbody>
    </table>

    <c:choose>
      <c:when test="${empty empEditForm.empId}">
        <form:button name="update">登録</form:button>
      </c:when>
      <c:otherwise>
        <form:button name="update">更新</form:button>
      </c:otherwise>
    </c:choose>

    </form:form>
</body>
</html>