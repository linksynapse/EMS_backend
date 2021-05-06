<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.82.0">
    <title>SDK::E-PASS</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

    

    <!-- Bootstrap core CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      
      html,
		body {
		  height: 100%;
		}
		
		body {
		  display: flex;
		  align-items: center;
		  padding-top: 40px;
		  padding-bottom: 40px;
		  background-color: #f5f5f5;
		}
		
		.form-signin {
		  width: 100%;
		  max-width: 330px;
		  padding: 15px;
		  margin: auto;
		}
		
		.form-signin .checkbox {
		  font-weight: 400;
		}
		
		.form-signin .form-floating:focus-within {
		  z-index: 2;
		}
		
		.form-signin input[type="email"] {
		  margin-bottom: -1px;
		  border-bottom-right-radius: 0;
		  border-bottom-left-radius: 0;
		}
		
		.form-signin input[type="password"] {
		  margin-bottom: 10px;
		  border-top-left-radius: 0;
		  border-top-right-radius: 0;
		}
    </style>
  </head>
  <body class="text-center" style="background-image: url('assets/img/BackGround.png');background-size:cover">
	<main class="form-signin">
	  <form>
	    <img class="mb-4" src="assets/img/logo.png" alt="" width="256" height="144">
	    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
	
	    <div class="form-floating mb-2">
	      <input type="text" class="form-control" id="Identify" name="Identify" placeholder="identify">
	      <label for="Identify">Identify</label>
	    </div>
	    <div class="form-floating">
	      <input type="password" class="form-control" id="Password" name="Password" placeholder="Password">
	      <label for="Password">Password</label>
	    </div>
	
	    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
	    
	  </form>
	  <button class="w-100 h-100 btn btn-lg btn-primary mt-3" onClick="javascript:warning()">Contact Us</button>
	  <p class="mt-5 mb-3 text-muted">&copy; 2021. SDK CONSORTIUM</p>
	</main>
  </body>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  <script type="text/javascript">
  function warning(){
		alert("For information!\r\nPlease Contact to SDK HSE Department\r\nMr.Masum | Email: masum@sdkss.sg");
}
  
  $(document).ready(function () {
	  $("form").submit(function (event) {
	    var formData = {
	      Identify: $("#Identify").val(),
	      Password: $("#Password").val()
	    };

	    $.ajax({
	      type: "POST",
	      url: "authentification/login",
	      data: formData,
	      dataType: "json",
	      encode: true,
	    }).done(function (rdata) {
	      if(rdata.return == 0){
	    	  window.location.href = "manage";
	      }else{
	    	  alert(rdata.data[0].msg);
	      }
	    });

	    event.preventDefault();
	  });
	});
  </script>
</html>