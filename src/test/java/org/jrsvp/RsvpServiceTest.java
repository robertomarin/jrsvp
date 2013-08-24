package org.jrsvp;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring-servlet.xml" })
public class RsvpServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private RsvpService rsvpService;

	@Test
	public void insereUmNovoRsvp() {
		Rsvp rsvp = new Rsvp();
		rsvp.setEmail(System.currentTimeMillis() + "@gmail.com");
		rsvp.setDdd("11");
		rsvp.setPhone("111111");
		rsvp.setName("Some Random Name " + System.currentTimeMillis());

		rsvpService.store(rsvp, null);

		System.out.println(rsvp.getId());

	}
}
