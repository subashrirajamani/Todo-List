var app=angular.module("MainApp",["ngRoute","ngResource"]);
app.config(function($routeProvider,$locationProvider)
		{
	$routeProvider.when("/",{
		templateUrl:"partial/MainApp.html",
		controller:"maincontroller"
			
	}).when("/login",{
		templateUrl:"partial/login.html",
		controller:"logincontroller"
	}).when("/register",{
		templateUrl:"partial/register.html",
		controller:"registercontroller"
	}).when("/home",{
		templateUrl:"partial/home.html",
		controller:"homecontroller"
	}).otherwise({
		redirectTo:"/"
	});
$locationProvider.html5Mode(true);
		});