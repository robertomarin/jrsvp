package org.jrsvp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "rsvp")
public class Rsvp {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 200)
	private String name;

	@Column(length = 100)
	@Email(message = "Favor digitar um e-mail válido", regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;

	@Column(length = 2)
	@Length(max = 2, message = "DDD deve ter no máximo 2 dígitos")
	private String ddd;

	@Column(length = 9)
	@Length(max = 9, message = "Telefone inválido.")
	@Range(min = 1000000, message = "Telefone inválido.")
	private String phone;

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// public String[] getComingWithYou() {
	// return comingWithYou;
	// }
	//
	// public void setComingWithYou(String[] comingWithYou) {
	// this.comingWithYou = comingWithYou;
	// }

}
