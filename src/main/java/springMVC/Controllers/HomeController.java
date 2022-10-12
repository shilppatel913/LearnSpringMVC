package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//here you will handle all the request and write the code to handle the data and show it on your browser
	@RequestMapping("/home")
	public String home() {
		System.out.println("Inside home");
		return "index";    //this is the view name index.jsp you are returning it in the form of string 
	}
}
