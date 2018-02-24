package springdemo;
import org.hibernate.Session;
public interface EmployeeCRUDIntf {
   public  void listEmployees( Session session );
   public  void addEmployee(Employee e1,Session session);
   public  void updateEmployee(Integer EmployeeID, int salary,Session session );
   public  void deleteEmployee(Integer EmployeeID,Session session);
}