package org.jrsvp;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.groups.Default;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RsvpController {

	@Autowired
	private RsvpService rsvpService;

	@Autowired
	private Validator validator;

	// @RequestMapping(value = "/rsvp/", method = {POST, GET }, consumes =
	// "application/json", produces = "application/json")
	@RequestMapping(value = { "/rsvp*" }, method = { POST, GET })
	@ResponseBody
	public final DefaultResponse create(Rsvp rsvp, String[] comingWithYou, HttpServletRequest request) {
		
		
		System.out.println("olá mundo! :D");

		Set<ConstraintViolation<Rsvp>> errors = validator.validate(rsvp, Default.class);
		DefaultResponse rsvpResponse = new DefaultResponse(errors);
		rsvpResponse.setObject(rsvp);

		rsvpService.store(rsvp, comingWithYou);

		return rsvpResponse;
	}
}