package springMVC.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

		@ExceptionHandler(value = NullPointerException.class)
		public String func1(Model model) {
			model.addAttribute("message","NullPointer Exception has occured on the server side");
			return "exception";
		}
		
		//to handle any type of exception we can make generic exception handler and pass the parent class as the value
		@ExceptionHandler(value=Exception.class)
		public String func2(Model model) {
			model.addAttribute("message","NullPointer Exception has occured on the server side");
			return "exception";
		}
}
