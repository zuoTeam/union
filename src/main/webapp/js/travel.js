$(function(){
	//表单的validate即“校验方法”，其参数必须用{多个校验选项配置}
	$("form").validate({
		/*以下的每个选项名均是关键字，不能修改！！*/
		errorClass:"error",
		
		/*如果校验通过，表单要运行的函数*/
		submitHandler:function(form){
			form.submit();//直接将“当前通过校验的表单”提交
		},
		
	/*校验规则*/
	rules:{
		//每个规则的名字就是表单中标签控件的name属性值（这是jquery validate的设计，别纠结！！）
		issueTitle:{required:true},
		issueTravelPlace:{required:true},
		issueTravelTime:{required:true},
		issueTravelContent:{required:true}
	},
	
	/*“不满足校验规则”的出错提示*/
	messages:{
		//每个提示子选项名称必须与前面规则的名称相同，即标签控件的name值
		issueTitle:{required:"填入出行主题，更能方便找到您的小伙伴哟..."},
		issueTravelPlace:{required:"去哪出行呢，亲..."},
		issueTravelTime:{required:"什么时候出发呢？小伙伴..."},
		issueTravelContent:{required:"随便写点相关有意思的事情吧！小伙伴..."}
	}
		//...
		
	});//the END of validate method
	
	$("#toBePartner").click(function(){
		if(null==$("#userId").val()||""==$("#userId").val()){
			alert("亲，你还没有登录哦！请登录后寻找你的小伙伴去旅行吧！");
			return;
		}
		$.ajaxSetup({
			  url: "toBePartner",
			  type: "GET",
			  dataType:"text",
			  data:{
				  "attendUserId":$("#userId").val(),
				  "travelId":$("#travelId").val(),
			  }
			});
		
		if(confirm("确定要与"+$("#initiatorDiv span").html()+"一起去"+$("h4 span").html()+"旅行吗？")){
			$.ajax({
				success:function(resultData){
					$("#resultSpan").html(resultData);
					$("#resultSpan").css("color","blue");
				}
			});
		}
	});
});

function selectPage(pageNo){
	location.href="toViewAllTravels?currentPage="+pageNo;
}

function issueTravel(isLogin){
	if(!isLogin){
		alert("亲，你还没有登录哦！请登录发布出游信息，寻找你的小伙伴吧！");
	}else{
		$("#contentDiv").css("display","none");
		$("#issueTravelDiv").css("display","block");
	}
}

function toBePartner(travelId,attendUserId){
	$.ajax({
		  url: "toBePartner",
		  type: "GET",
		  dataType:"text",
		  data:{
			  "attendUserId":attendUserId,
			  "travelId":travelId,
		  },
		  success:function(resultData){
				alert(resultData);
			}
		});
}
