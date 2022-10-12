package springMVC.Controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	//here you will handle all the request and write the code to handle the data and show it on your browser
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Inside home");
		model.addAttribute("name","Shilp Patel");
		//you can also send the list of data if you want from controller to views
		List<String> students=new ArrayList<String>();
		students.add("Chavi");
		students.add("Aays");
		students.add("Sansa");
		model.addAttribute("s",students);
		model.addAttribute("id",3);
		return "index";    //this is the view name index.jsp you are returning it in the form of string 
	}
	
	// here we will send the data with the help of modelandview
	//help.jsp will be the view file
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("name","Shilp Patel");
		LocalDateTime now=LocalDateTime.now();
		modelView.addObject("date",now);
		modelView.setViewName("help");
		List<Integer> m=new ArrayList<Integer>();
		m.add(123);
		m.add(3455);
		m.add(789);
		modelView.addObject("marks",m);
		return modelView;
	}
}
