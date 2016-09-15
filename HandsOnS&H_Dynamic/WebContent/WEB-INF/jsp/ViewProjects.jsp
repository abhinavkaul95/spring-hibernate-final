<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="resources/js/jquery.js"></script>
<style type="text/css">
body{
background-color: aqua;
}
.tablemain{
border: 1px dashed red;
}

.tablesec{
border: 1px solid fuchsia;
}

#tablemain{
margin-left: 40%;
}
#results{
margin-top: 2%;
margin-left: 25%;
}

</style>
<script type="text/javascript">
$(function(){
  $("a").click(function(event){
	  event.preventDefault();
	  var url = $(this).attr("href");
	  var id = $(this).attr("id");
      $.ajax({
        type: 'GET',
        url: url,
    	dataType: 'json',
    	success: function(data, textStatus) {
           $("#id-"+id).html("");
           var i = 0;
           if (data.length == 0){
			
           }
           while(i < data.length){
    	   $("#id-"+id).append("<tr><td>" + data[i]["handPhone"] + "</td><td>" + data[i]["donorName"] + "</td><td>" + data[i]["email"] + "</td><td>" + data[i]["address"]["addressLine1"] + data[i]["address"]["addressLine2"] + " " + data[i]["address"]["cityName"] + " " + data[i]["address"]["pinCode"] + " " + "</td></tr>");
		   i++;
           }
           
      		  }
    		});
	  if($(this).text() == "View"){
     	 $(this).text("Unview");
     	 $(this).attr("href","#");
	  }
	  else{
		  $(this).text("View");
		  $("#id-"+id).html("");
		  $(this).attr("href","ViewDonorList/"+id);
	  }
  });
});
</script>
</head>
<body>
<h1 style="text-align: center;">List of projects and donors</h1>
<h3 style="text-align: center;">List of projects</h3>
<table class="tablemain" id="tablemain">
<c:url var="url" value="ViewDonorList"></c:url>
<c:forEach items="${list}" var="project">
<tr class="tablemain">
<td class="tablemain"><c:out value="${project.projectId}"></c:out></td>
<td class="tablemain"><c:out value="${project.projectName}"></c:out></td>
<td class="tablemain"><c:out value="${project.projectBudget}"></c:out></td>
<td class="tablemain"><c:out value="${project.amountCollected}"></c:out></td>
<td><a href="${url}/${project.projectId}"  id="${project.projectId}">View</a></td>
<td id="id-${project.projectId}"></td>
</tr>
</c:forEach>
</table>
</body>
</html>