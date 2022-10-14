package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public RedirectView func1() {
		System.out.println("Inside one");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
//		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String func2() {
		System.out.println("Inside two");
		return "";
	}
}
