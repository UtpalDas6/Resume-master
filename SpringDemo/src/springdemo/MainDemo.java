package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
public static void main(String[] args) {
      /*ApplicationContext context = new ClassPathXmlApplicationContext("file:src/springdemo/spring.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.setMessage("Ron");
      obj.getMessage();
      obj.getX();
      obj.getW1().show("welcome2");
      System.out.println("=====================================================================");*/
      //AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
	  ApplicationContext context = new ClassPathXmlApplicationContext("file:src/springdemo/spring.xml");
	  Employee e=(Employee)context.getBean("employee");
      System.out.println("Name in main method:"+e.getEname());
      System.out.println("Role in main method:"+e.getRole()); 
      System.out.print("Address: "+e.getAddress().getCity());
      System.out.println("- "+e.getAddress().getPincode());
   }
}
