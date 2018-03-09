var app=angular.module("MainApp");
app.controller("logincontroller",["$scope","$rootScope","$http",function($scope,$rootScope,$http){
	$scope.clickshow=function()
	{
		if($("#checkbox4").prop("checked")==true)
			{
			$("#pwd").attr("type","text");
			}
		if($("#checkbox4").prop("checked")==false)
			{
			$("#pwd").attr("type","password");
			}
	},
	$scope.signIn=function()
	{
		var username=$scope.user_input;
		var password=$scope.pwd_input;
		var request=$http.get("/customer/login/"+username+"/"+password);
		request.then(function(response){
			$scope.info=angular.copy(response.data);
			console.log($scope.info);
		})
	},
	$scope.register=function()
	{
		window.location.href="/register";
	}
	
}]);