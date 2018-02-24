/*
 * Person.java
 *
 * Created on 2006年5月13日, 上午12:00
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package springdemo;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * You should use this sql "create table PERSON(ID INT PRIMARY KEY,NAME VARCHAR(255))" to create this person table
 * @author Administrator
 */
public class Person{
       private int id;
       private String name;

       public void setId(int value) {
              this.id = value;
       }

       public int getId() {
              return this.id;
       }

       public void setName(String value) {
              this.name = value;
       }

       public String getName() {
              return this.name;
       }
       
       public static void main(String[] args){
            Configuration config=new Configuration().configure("/SpringDemo/src/springdemo/hibernate.cfg.xml");
            SessionFactory factory=config.buildSessionFactory();
            Session session=factory.openSession();
            Transaction tran=session.beginTransaction();
            //ini persons data
            String[] persons = new String[]{"John","Smith","Ada","Tom","Jack"};
            for (int i=0;i<persons.length;i++) {
              Person p=new Person();
              p.setName(persons[i]);
               session.save(p);
            }                       
            tran.commit();
            session.close();
        }
}