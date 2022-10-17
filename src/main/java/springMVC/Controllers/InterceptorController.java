package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//we will be using interceptors for the paths mentioned in this controller

@Controller
public class InterceptorController {

	@RequestMapping("/interceptor")
	public String showForm() {
		return "interceptorForm";
	}
	
	@RequestMapping(path="/responseInterceptor",method=RequestMethod.POST)
	public String getResponse(@RequestParam("userName") String userName,Model model) {
		System.out.println("My name is "+userName);
		model.addAttribute("name",userName);
		return "interceptorResponse";
	}
}
