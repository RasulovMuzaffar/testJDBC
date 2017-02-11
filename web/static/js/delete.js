$(function(){
	$("a.ahref").click(function() { 
		var id = $(this).attr("value");
                var flag = "del";
		var href = $(this).attr("href");
//		$.POST( href, {id: id,flag:flag}, function(data) {
//			alert( data );
//		});
//		return false;
console.log(id);
	});
});