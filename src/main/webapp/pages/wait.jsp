<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="refresh" content="2;url=<s:url includeParams="all" />"/>
	</head>
 
	<body>
		<h1>Struts 2 execAndWait example</h1>
	
		<h3>Please wait while we process your request... </h3>
		
		<h3><s:property value="counter"/> lines processed out of <s:property value="nbMax"/></h3>
		
		<a href="http://www.google.com" target="blank">google</a>
	
	</body>
</html>