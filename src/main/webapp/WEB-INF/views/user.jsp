<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="demo">
    <meta name="author" content="godwin">
    <link rel="icon" href="/favicon.ico">

    <title>Starter Template for Bootstrap</title>

    <!-- CSS -->
    <link href="/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/bootstrap3/css/bootstrap-theme.min.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 50px;
      }
    </style>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <div class="starter-template">
        <h1>User Demo</h1>
        <form class="form-inline" action="/user/create" >
		    <div class="form-group">
		        <label class="sr-only" for="inputName">姓名</label>
		        <input type="username" class="form-control" id="inputName" name="name" placeholder="姓名">
		    </div>
		    <div class="form-group">
		        <label class="sr-only" for="inputAge">Password</label>
		        <input type="age" class="form-control" id="inputAge" name="age" placeholder="年龄">
		    </div>
		    <button type="submit" class="btn btn-primary">提交</button>
		</form>
      </div>

    </div><!-- /.container -->


    <!-- JavaScript
    ================================================== -->
    <script src="/static/jquery/js/jquery-1.11.3.min.js"></script>
    <script src="/static/bootstrap3/js/bootstrap.min.js"></script>
  </body>
</html>
