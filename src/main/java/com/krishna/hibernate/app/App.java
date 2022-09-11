package com.krishna.hibernate.app;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.krishna.hibernate.app.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.config.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Student s1=new Student();
       s1.setId(1);
       s1.setName("Krishna");
       s1.setCity("Bangalore");
       Student s2=new Student();
       s2.setName("Kumar");
       s2.setCity("Bihar");
       Session session=factory.openSession();
      // Student stud=session.get(Student.class,1);
       //Student stud1=session.get(Student.class,2);
      Student stud= session.get(Student.class, 1);
      Student stud1= session.get(Student.class, 2);
      /* Transaction trans=session.beginTransaction();
       session.save(s1);
       session.save(s2);
       trans.commit();*/
      System.out.println(stud);
      System.out.println(stud1);
       session.close();
    }
}
