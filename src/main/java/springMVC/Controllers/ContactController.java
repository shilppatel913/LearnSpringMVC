package springMVC.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.Models.User;
import springMVC.services.UserService;

//this controller is showing of sending the data from view to controller
//we will be using @RequestParam to get the data from the contact view
/*If there is a common thing which we want to show on all pages @ModelAttribute can be used
 	above the handler method for that. Make sure to insert it before all the handler methods
 */




@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonCode(Model model) {
		model.addAttribute("channel","Code with harry");
		model.addAttribute("rating","Not bad");
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Inside contact form and in the Contact Controller");
		return "contact";
	}
	
	//now let us @ModelAttribute which is the most important and makes our work easy
	//it will automatically map all the form data to the user object fields given the order has been kept same
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String getFormDetails(@ModelAttribute User user) {
		Integer r=this.userService.serviceSaveUser(user);
		System.out.println("The number of rows affected and user is saved successfully"+r);
		return "success";
	}
	
	
	
	//need a handler method to get all the data
	
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String getFormDetails(@RequestParam("userEmail") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model) {
				
		System.out.println("The user email is"+userEmail);
		System.out.println("The user name  is"+userName);
		System.out.println("The user password is"+userPassword);
		model.addAttribute("email",userEmail);
		model.addAttribute("name",userName);
		model.addAttribute("password",userPassword);
		return "success";
	} */
	
	
}
