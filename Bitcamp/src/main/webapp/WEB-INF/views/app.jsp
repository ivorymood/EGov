<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%=application.getContextPath() %>"/>
<script src="${ctx}/resources/js/app.js"></script>    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	app.init({
		context : '${ctx}',
		result: '${exist}'
	});
</script>
