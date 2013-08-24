package org.jrsvp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RsvpDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public RsvpDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void store(Rsvp rsvp) {

		Session session = sessionFactory.openSession();
		session.save(rsvp);
		session.close();
	}
}
