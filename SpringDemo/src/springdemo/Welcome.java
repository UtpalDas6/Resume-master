package springdemo;

import org.springframework.stereotype.Component;

@Component
public class Welcome { 
  private String message="Hi, Welcome to Spring. Happy learning!!";
  public void show(String x) { 
   System.out.println(message+" "+x);
  }
}
