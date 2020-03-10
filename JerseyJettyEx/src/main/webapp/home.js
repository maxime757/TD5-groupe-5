
function getServerData(url, success){
    $.ajax({
        dataType: "json",
        url: url
    }).done(success);
}

function callDone(result){
	var templateExample = _.template($('#templateExample').html());

	var html = templateExample({
		"attribute":JSON.stringify(result)
	});

	$("#result").append(html);
}

$(function(){
	$("#button").click(function(){
		getServerData("ws/example/aircraft",callDone);
	});
});

/**
 * conflict name with the other function getServerData
 * @param {*} url 
 */

function GetServerData(url){
	$.ajax({
    type: "GET",
    contentType: "application/json; charset=utf-8",
    url: url,
    data: '{ "param1": "aaa" }',
    success: function (msg) {
        alert(msg.d);
    }
	});
}
function postServerData(url){
	$.ajax({
     type:"POST",
     url: url,
     dataType : 'text',  //<------since your controller returns string use "text"
     success: function(msg){
         $("#show").text(msg);
     },
     error: function(xhr){  //<----use this callback to get the xhr errors
        console.log(xhr);
     }
	});
}
function putServerData(url){
	$.ajax({
   url: url,
   type: 'PUT',
   success: function(response) {
     //...
   }
	});
}
	
function deleteServerData(url){
	$.ajax({
    url: url,
    type: 'DELETE',
    contentType: 'application/json',
    success: function(result) {
        // handle success
    },
    error: function(request,msg,error) {
        // handle failure
    }
	});
}






