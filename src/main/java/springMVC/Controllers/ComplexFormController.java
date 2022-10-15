package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.Models.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/complex")
	public String handleForm() {
		System.out.println("Inside the complex form");
		return "complex_form";
	}
	
	@RequestMapping(path="/subComplex",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Student student) {
		System.out.println(student);
		return "";
	}
}
