$(function(){
	 $("#but").click(function(){
		var str=$("#id").val()
		$.ajax({
			url:"/dept/OneDept",
			type:"GET",
			data:{id:str},
			dataType:"json",
			success:function(mag){
				$("#tab tr td").remove()
				 var ImageContent = "";              
              $.each(mag, function (index, val) {
                  if (index == "data") {
                      if (val.length > 0) {        
                    	  if(!val[0]){
                        	  alert("抱歉没有"+str+"员工号的用户信息");
                          }
                          for (var i = 0; i < val.length; i++) {
                             ImageContent += '<tr><td>'
                            	 + val[i].id + '</td><td>'
                            	 + val[i].dept.bumen + '</td><td>'
                            	 + val[i].name + '</td><td>'
                            	 + val[i].sex + '</td><td>'
                            	 + val[i].salacy 
                    + "</td><td><a class='btn btn-danger' href=/dept/DeleteEmployee?id="+ val[i].id +">删除</a>" +
                    "&nbsp&nbsp <a class='btn btn-success' href=/dept/OneEmployee?id="+ val[i].id +">修改</a></td></tr>";
                          }
                          $('#tab').append(ImageContent);
                      }
                     
                  }                 
              });
				
			}
		})
	 });
	 
	 $("#but1").click(function(){
		var str=$("#bs").val()
		$.ajax({
			url:"/dept/AllDept",
			type:"POST",
			data:{bs:str},
			dataType:"json",
			success:function(mag){
				$("#tab tr td").remove()			
				 var ImageContent = "";              
				$.each(mag, function (index, val) {
                  if (index == "employee") {            
                      if (val.length > 0) {                    	 
                          for (var i = 0; i < val.length; i++) {
                             ImageContent += '<tr><td>'
                            	 + mag.dept + '</td><td>'
                            	 + mag.bumen + '</td><td>'
                            	 + val[i].name + '</td><td>'
                            	 + val[i].sex + '</td><td>'
                            	 + val[i].salacy + 
                    "</td><td><a class='btn btn-danger' href=/dept/DeleteEmployee?id="+ val[i].id +">删除</a>" +
                  "&nbsp&nbsp <a class='btn btn-success' href=/dept/OneEmployee?id="+ val[i].id +">修改</a></td></tr>";
                          }
                          $('#tab').append(ImageContent);
                      }else{
                    	  alert("抱歉没有"+str+"号部门的用户信息")
                      }
                  }        
              });
				
			}
		})
	 });
	 
	 $("#but2").click(function(){
		$.ajax({
			url:"/dept/EmployeeAll",
			type:"POST",
			dataType:"json",
			success:function(mag){
				$("#tab tr td").remove()
				 var ImageContent = "";              
              $.each(mag, function (index, val) {     
              	if(index=="data"){
                      if (val.length > 0) {
                    	  if(!val[0]){
                        	  alert("抱歉没有的用户信息");
                          }
                          for (var i = 0; i < val.length; i++) {
                             ImageContent += '<tr><td>'+ val[i].dept.dept + '</td><td>'+ val[i].dept.bumen + '</td><td>'+ val[i].name + '</td><td>'+ val[i].sex + '</td><td>'+ val[i].salacy+ "</td><td><a class='btn btn-danger' href=/dept/DeleteEmployee?id="+ val[i].id +">删除</a>&nbsp&nbsp" +" <a class='btn btn-success' href=/dept/OneEmployee?id="+ val[i].id +">修改</a></td></tr>";
                          }
                          $('#tab').append(ImageContent);
                      }   
              	}
              });
				
			}
		})
	 });
	 
});