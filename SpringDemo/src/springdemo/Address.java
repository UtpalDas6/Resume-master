package springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
    @Value("Chennai")
    private String City;
    @Value("600077")
    int pincode;
    public Address(String City, int pincode) {
       this.City = City;
       this.pincode = pincode;
    }
   public Address() {
   }
   public int getPincode() {
        return pincode;
   }   
   public void setPincode(int pincode) {
       this.pincode = pincode;
   }
   public String getCity() {
       return City;
   }
   public void setCity(String City) {
       this.City = City;
   }
 }