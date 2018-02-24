package springdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	
	@AfterReturning(pointcut="execution(* springdemo.Employee.get*(..))", returning="rvalue")
	public void beforeAdvice() {
		 System.out.println("Return value in advice:");
	}
	
}
