package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping(value= {"/","/login","/register","/home"})
public String homepage()
{
	return "index";
}
}
