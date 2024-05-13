package com.SMS;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
        
        Student s1=new Student();
        
        System.out.println("Enter studnet First name ");
        s1.setFirstName(sc.next());
        System.out.println("Enter student Last name");
        s1.setLastName(sc.next());
        System.out.println("Enter Email ");
        s1.setEmail(sc.next());
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(s1);
       tx.commit();
       session.close();
       System.out.println(s1);
        
    }
}
