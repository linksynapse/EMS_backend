<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>SDK::E-PASS</title>
</head>
<body style="background-image: url('assets/img/BackGround.png');background-size:cover">
<div style="float:right">
	<button style="height:40px" OnClick="javascript:warning()">Contact Us</button>
</div>
<div>
	<form action="sign_in" method="post">
		<input type="text" name="Name" placeholder="Name"/>
		<input type="password" name="NRIC" placeholder="NRIC"/>
		<input type="submit" value="LOGIN"/>
	</form>
</div>
</body>
<script>
	function warning(){
		alert("For information!\r\nPlease Contact to SDK HSE Department\r\nMr.Masum | Email: masum@sdkss.sg");
	}
</script>
</html>
