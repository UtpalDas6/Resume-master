package springdemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Config { 
   @Bean
    Address address() {
	
                       return new Address("Bangalore",560082);
    } 
   @Bean
   Employee emp() {
                         Employee e=new Employee();
                         e.setEname("Smith");
                         e.setRole("TA");
                         e.setAddress(address());
                         return e;	      
    }    
}
