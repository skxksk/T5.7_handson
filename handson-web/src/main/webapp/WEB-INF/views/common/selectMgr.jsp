<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>マネージャ選択画面</title>
<script type="text/javascript">
<!--

function selectMgr(){
    let parentExists = true;

    // ウィンドウオブジェクトが存在していない時警告してフラグをfalseに
    if ( !window.opener || !Object.keys(window.opener).length ) {
        alert('親画面が存在しません')
        parentExists = false;
    }

    // 親画面に値を挿入
    if(parentExists){
        const mgrs = document.querySelectorAll("input[name=empId]");
        const mgrNames = document.querySelectorAll("input[name=mgrName]");

        const pDocument = window.opener.document;
        for(let i = 0; i < mgrs.length; i++) {
            if( mgrs[i].checked ) {
                pDocument.querySelector('#mgr').value = mgrs[i].value;
                pDocument.querySelector('#mgrName').value = mgrNames[i].value;
                break;
            }
        }
    }

    window.close();
}

 -->
</script>
</head>

<body>

<%--
     <form:form modelAttribute="empEditForm" >
        <form:radiobuttons path="empId" items="${mgrInfoList}" itemValue="empId" itemLabel="ename" delimiter="<br>" />
    </form:form>
--%>

    <form:form modelAttribute="empEditForm" >
        <c:forEach var="mgrInfo" items="${mgrInfoList}">
            <form:radiobutton path="empId"  value="${mgrInfo.empId}" label="${mgrInfo.ename}（${mgrInfo.jname}）" /><br />
            <input type="hidden" name="mgrName" value="${mgrInfo.ename}">
        </c:forEach>

        <input name="confirm" type="button" value="選択" onClick='selectMgr()'/>
    </form:form>
</body>
</html>