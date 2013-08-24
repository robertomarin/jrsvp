package org.jrsvp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

public class DefaultResponse {

	public boolean ok;

	public List<Message> messages = new ArrayList<Message>();

	private Object object;

	public DefaultResponse(Set<ConstraintViolation<Rsvp>> errors) {

		for (ConstraintViolation<Rsvp> constraintViolation : errors) {
			messages.add(new Message(constraintViolation.getMessage(), constraintViolation.getPropertyPath()));
		}

		ok = messages.isEmpty();
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

}
