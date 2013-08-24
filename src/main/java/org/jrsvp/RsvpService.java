package org.jrsvp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RsvpService {

	@Autowired
	private RsvpDao rsvpDao;

	public void store(Rsvp rsvp, String... commingWithYou) {
		rsvpDao.store(rsvp);

	}

}
