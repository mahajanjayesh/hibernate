package tutorial1.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tutorial1.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();

		user.setUserId(1);
		user.setUserName("JM");
		user.setAddress("Address");
		user.setJoinDate(new Date());
		user.setDescription("Desciption goes here");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

	}

}
