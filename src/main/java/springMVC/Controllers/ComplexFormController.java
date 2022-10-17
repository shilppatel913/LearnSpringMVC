package springMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.Models.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/complex")
	public String handleForm() {
		System.out.println("Inside the complex form");
//		String s=null;
//		System.out.println(s.length()); //null pointer exception will be thrown on the server side
		return "complex_form";
	}
	
	@RequestMapping(path="/subComplex",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student,BindingResult result) {
		if(result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		return "datashow";
	}
	
	///exception handler methods for this particular controller
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandling1(Model model) {
//		model.addAttribute("message","Exception has occured on the server side");
//		return "exception";
//	}
	
}
