package com.iisn.hibernate.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
    public static void main(String[] args) {
        StudentRegistration ru = new StudentRegistration();
        BusRouteDetails brd = new BusRouteDetails();
        brd.setBusRoute("Karur to karadampalayam");
        ru.setDept("Sport");
        ru.setName("Vishvajith.G.S");
        ru.setBusRoute(brd);
        Configuration c = new Configuration().configure().addAnnotatedClass(StudentRegistration.class).addAnnotatedClass(BusRouteDetails.class);
        // Ensure the path here matches the actual location of your hibernate.cfg.xml file

        
        ServiceRegistry s = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
        SessionFactory sf = c.buildSessionFactory(s);
        Session ss = sf.openSession();
        Transaction trans = ss.beginTransaction();
        ss.save(brd);
        ss.save(ru);
        
        trans.commit();
        System.out.print("success");
        ss.close();
        sf.close();
    }
}
