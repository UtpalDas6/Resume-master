package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class HelloWorld {
   @Value("John")
   private String message;
   @Value("10")
   private int x;
   @Autowired
   private Welcome w1;
  
   public void setMessage(String m){
	   this.message=m;
   }
   public void setX(int x){
	   this.x=x;
   }
   
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void getX(){
	      System.out.println(x);
   }
   public Welcome getW1(){
	   return w1;
   }
}