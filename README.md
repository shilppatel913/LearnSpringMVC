**What is Spring MVC(Model-View-Controller)**

1) A  Spring MVC is a sub framework of the Spring Framework which is used to build web applications.
2) It is build on the top of Servlet API,
3) It follows the Model-View-Controller design pattern which was not present in Servlets.

Model means creating and working with database models.
View means creating HTML pages.
Controller means who will have the control of the particular request and how things will be carried out in the backend.

**Why SpringMVC**
1) In Spring MVC we are seperately working on building models , views and controllers meaning all three of them are loosely coupled.
2) Powerful configuration.
3) MVC is quite flexible and supports rapid application development.


**Working with Spring MVC**
![Working of Spring MVC](https://user-images.githubusercontent.com/74822210/195158921-b6b123e6-a1ce-4952-a43c-6eeedc976ccc.jpg)

Above is the standard client-server web architecture. The front Controller here is also known as Dispatcher Servlet.


**SpringMVC creation steps(very important)**
1) Configure your DispatcherServlet in your web.xml
2) Create Spring configuration file. (With the same name as that of the servlet in the same folder). For example if the name of the servlet is spring then
the configuration file should be named as spring-servlet.xml
3) Create the bean of the InternalViewResolver class and fill the properties (prefix- mention the path where you are going to save your views ans suffix- mention the 
extension)
4)Create a controller and handle request from there. Basically this is your backend. Use the @Controller annotation to tell java that your class is a controller class.
5) Create views and run your server.


**Sending Data from Controller to View**

1) We can use the object of the Model class
  We can use the method known as addAttribute(String key,Object value);
  Then we can get the data in our view file using the key
2) We can use the model view class 
  We can use the method known as addObject(String key,Object value)
  
 **JSP Expression language**
 isElIgnored should be set to false in the jsp view page
 ${pass the key_name} 
 
 if it is a collection and you want to to traverse and print each item present in it then
 you need add a a dependency of jstl first in your pom.xml
 and you need to add jstl uri in the jsp view page.
 
 
 
 **Sending data from View to Controllers**
 This is basically handling a post request and sending the data to the backend to save to the database or perform some operations on it.
 A simple contact form is a good example for this kind of architecture.
 When the user clicks on the submit button the params(in java it is HttpServletRequest) parameter will have all the data in it.
 We can fetch this data in a particular controller by using the method getRequestParameter("name of the field") through which we can access every field one by one by
 passing the name of the parameter.
 There is one more way which will give all the data in one go and it is by using this below annotations
 1) @RequestParam - Will give one field at a time.
 2) @ModelAttribute - Will give the whole data and convert it into an object.

We will be using the above two methods for sending the data from view to controller.
Now how will the view know that to which controller it has to send the data?
In the action attribute of the form tag we can mention the name of the controller and data can be accessed by that particular controller only.


**Standard way to store the form data into the database using spring ORM*

If user is your entity and controller is your controller class then below is the given data flow
view -> controller -> service layer -> userdao -> hibernateTemplate -> database
Enable the <context:component-scan base-package="" /> to enable all your annotations and autowiring(no need to explicitly create refs)
and do not forget to enable the transactional annotation to perform write operations from your application into the database.


**Redirect in SpringMVC**
There are two ways to redirect from a particular url,
1) Use Redirect Prefix 
    Syntax : you can return from the controller return "redirect:/url"
 2) Use Redirect View
  Mention the return type of your controller as RedirectView and then make object and then fire this method obj.setUrl and return that object.
  
  
  
  
  **How to handle form errors in SpringMVC**
  When a user submits a form which has invalid values or leaves some of the fields empty then we can show this error to the user by using the interface known as 
  BindingResult which implements the Error interface and can be used in the parameters to check for error by implementing it's boolean method hasErrros().
  The error can be shown near the form itself by adding the form errors tag in your jsp file. You will have to import this tag library. This method is controller
  specific that means it will run only in the controller where these exception handler methods are present. For other controllers it will not work. 
  
  
 **To create a centralized exception Handler**
 We can create a different class which handles exceptions for all the controllers present in our project. Inside this class we define all the above exception handler
 methods using the @ExceptionHandler annotation. Spring MVC has to know that this particular class constitutes all the exception handler method and for that we need to
 label the class with @ControllerAdvice annotation and exception will be handled for all the controllers.
  
  
  
  
  
  **How to enable javascript,css and serve static images in a jsp file**
 Standard way is to make a resources folder in the WEB-INF folder. After that you need to add this resource path in your xml file using mvc. After that you have to
 add one tag library in your jsp where you want to add your css and js and images and then with the help of the prefix you can add the url of your files.
 
 
 **FileUpload using springMVC**
 We can do the file uploading task by integrating the commons file upload and commons io dependency in our maven project. Hence whatever the user uploads as a file 
 will have the type of the implementation class of the MultiPartResolver interface.
 
 
 **How to get the slug from the uri template to the controller using @PathVariable Annotation**
 
@PathVariable annotation is used to bind the URI template variable(slug) to the method parameter. Below is the simple demonstration of how to use the @PathVariable
annotation.

@RequestMapping("/user/{userId}")   //this userId is the slug and is known as the URI template variable
public String func(@PathVariable("userId") int id){      //Now the userId has been binded to the id variable present in the params.
  System.out.println("My user id is"+id);
}



**Exception Handling n SpringMVC**
You can use @ExceptionHandler(value=NullPointerException.class) annotation and in the value attribute of the annotation you can mention the exception to be handled.
To handle all the exceptions you can use the parent class Exception.class in the value attribute and any exception occuring on the server side will be handled. A view
can also be returned so that the client can also know that an error has occured which is easy to understand.
 

