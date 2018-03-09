var app=angular.module("MainApp");
app.controller("registercontroller",["$scope","$rootScope","$http",function($scope,$rootScope,$http){
	$scope.initcontrol=function()
	{
		$scope.name="suba";
	},
	$scope.signUp=function()
	{
		var username=$scope.user_input;
		var initialpassword=$scope.pwd_input;
		var finalpassword=$scope.confirm_pwd_input;
		var name=$scope.user_name;
		var dob1=$scope.user_dob;
		var dob=dob1.getFullYear()+"-"+(dob1.getMonth()+1)+"-"+dob1.getDate();
		var phone=$scope.user_phone;
		console.log(username+" "+initialpassword+" "+finalpassword+" "+name+" "+dob+" "+phone);
		if(username===undefined)
			{
			alert("Please enter user name");
			}
			else if(initialpassword===undefined)
		{
				alert("Please enter a password");
				
		}
		else if(finalpassword===undefined)
			{
			alert("Please confirm the password");
			
			}
		else if(name===undefined)
			{
			alert("Please enter your name");
			
			}
		else if(dob===undefined)
			{
			alert("Please enter your DOB");
			
			}
		else if(phone===undefined||phone.length!==10)
			{
			alert("Please enter a valid phone number");
			
			}
		else if(initialpassword!==finalpassword)
			{
			alert("Password doesn't match");
			}
		else{
		var data={"custid":username,"custphoneno":phone,"custname":name,"passwd":finalpassword,"custdob":dob};
		var request=$http({
			method:"POST",url:"/customer/register",data:data
		});
		request.then(function(response){
			$scope.info=angular.copy(response.data);
			console.log($scope.info);
		})}
	}
}]);