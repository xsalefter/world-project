package org.xsalefter.world.entity;

import java.io.Serializable;
import org.xsalefter.world.entity.Country;

public class City implements Serializable {

	private static final long serialVersionUID = 3050538044815795465L;

	private Long id;
	private Country country;
	
	public City() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
}
