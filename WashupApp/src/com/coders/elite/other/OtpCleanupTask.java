package com.coders.elite.other;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
 
public class OtpCleanupTask { 
	@Autowired
    private SessionFactory sessionFactory;    
    public void setSessionFactory(SessionFactory sf) {
     this.sessionFactory = sf;
    }
    //Define the method to be called as configured
	@Scheduled (fixedDelay=60000)
    public void execute()
    {

//		  Session session = this.sessionFactory.getCurrentSession();
//		  session.createQuery("from Otp O where O.timestamp < DATE_SUB( CURRENT_TIME(), INTERVAL 1 MINUTE)").executeUpdate();
        System.out.println("Cleanup done");
    }
}
