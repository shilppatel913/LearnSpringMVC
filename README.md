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

