<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>SDK::E-PASS</title>
</head>
<body style="background-image: url('assets/img/BackGround.png');background-size:cover">
<div style="float:right">
	<button style="height:40px" OnClick="javascript:startapp()">Start Management</button>
	<button style="height:40px" OnClick="javascript:warning()">Contact Us</button>
</div>
</body>
<script>
	function startapp(){
		start();
		intervalCheck();
		
	}

	function warning(){
		alert("For information!\r\nPlease Contact to SDK HSE Department\r\nMr.Masum | Email: masum@sdkss.sg");
	}
	
	function start(){
		window.location.href = "epass://" + window.location.host + "/${JSESSIONID}/${level}"
	}
	
	function download(){
		window.location.href = "assets/pg/ePassInstaller.msi"
	}

	function clearTimers(){
        clearInterval(heartbeat);
        clearTimeout(timer);
    }

    function intervalHeartbeat(){
        if(document.webkitHidden || document.hidden){
            clearTimers();
        }
    }
    function intervalCheck(){
    	heartbeat = setInterval(intervalHeartbeat, 200);
        var deLay = 3000;
        timer = setTimeout(function() {
        	if(confirm('If not show plugin click to \'Yes\' download plugin and .Net Core 3.1"')){
        		download();
        	}
        }, deLay);
    }
</script>
</html>
