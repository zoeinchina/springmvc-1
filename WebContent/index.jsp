<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<br/><br/>
	
	<br/><br/>
	
	<br/><br/>
	
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="TestRest PUT"/>
	</form>
	<br/><br/>
	
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="TestRest DELETE"/>
	</form>
	<br/><br/>
	
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="TestRest POST"/>
	</form>
	<br/><br/>
	
	<a href="springmvc/testRest/1">Test Rest Get</a>
	<br/><br/>
	
	<br/><br/>
	<a href="springmvc/testPathVariable/1">Test PathVariable</a>

	<br/><br/>
	<a href="springmvc/testAntPath/ddjuewih/abc">Test AntPath</a>

	<br/><br/>
	<a href="springmvc/testParamsAndHeaders?username=zhangsan&age=10">Test ParamsAndHeaders</a>

	<br/><br/>
	<form action="springmvc/testMethod" method="POST">
		<input type="submit" value="submit"/>
	</form>

	<br/><br/>
	<a href="springmvc/testMethod">Test Method</a>
	
	<br/><br/>
	<a href="springmvc/testRequestMapping">Test RequestMapping</a>
	
	<br/><br/>
	<a href="helloworld">Hello World</a>
	
</body>
</html>