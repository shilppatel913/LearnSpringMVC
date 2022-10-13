package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//this controller is showing of sending the data from view to controller
//we will be using @RequestParam to get the data from the contact view

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Inside contact form and in the Contact Controller");
		return "contact";
	}
	
	//need a handler method to get all the data
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String getFormDetails(@RequestParam("userEmail") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword
			) {
				
		System.out.println("The user email is"+userEmail);
		System.out.println("The user name  is"+userName);
		System.out.println("The user password is"+userPassword);
		
		return "";
	}
}
