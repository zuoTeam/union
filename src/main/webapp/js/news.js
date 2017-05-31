$(function(){
	
	$("#test").on("click",function(){
		goNews("",1,3);
	})
	
	/*$("#test").on("click",goNews("",1,3));*/
	
});

function goNews(keyWord,currentPage,typeId){
	$.ajax({
		type:"get",
		url:"goNews",
		data:{
			"keyWord":keyWord,
			"currentPage":currentPage,
			"typeId":typeId
		},
		success:function(jsonData){
			$("#contentBox").html("");
			$("#contentBox").append("1");
		}
	});
}