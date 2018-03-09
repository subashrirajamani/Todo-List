var app=angular.module("MainApp");
app.controller("maincontroller",["$scope","$rootScope","$http",function($scope,$rootScope,$http){
	$scope.initcontrol=function()
	{
		$scope.name="suba";
	}
}]);