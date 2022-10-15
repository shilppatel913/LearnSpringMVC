package springMVC.Controllers;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileUpload")
	public String showFileUpload() {
		System.out.println("Inside the file upload form");
		return "fileForm";
	}
	//the file which is coming will be binded to commonsmultipartfile class
	@RequestMapping(path="/uploadImage",method=RequestMethod.POST)
	public String imageUpload(@RequestParam("userFile") CommonsMultipartFile file,HttpSession s) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getContentType());
		
		//now i want to upload this file in one of our server path in web-inf/images
		byte[] data=file.getBytes();
		//now this data array has all the content in the byte form
		
		
		//this will give you the root path of your project and then you can upload by going inside the directories
		String path=s.getServletContext().getRealPath("/")+file.getOriginalFilename();
		System.out.println(path);
		
		//we have got the root path now let us upload in our desired directory 
		try {
			FileOutputStream output=new FileOutputStream(path); //the constructor takes path as a string
			output.write(data);
			output.close();
			System.out.println("File has been uploaded successfully");
		}catch(Exception e) {
			System.out.println("File could not be uploaded some exception occured");
		}
		
		
		
		System.out.println("Will get the file contents here");
		return "";
	}
}

