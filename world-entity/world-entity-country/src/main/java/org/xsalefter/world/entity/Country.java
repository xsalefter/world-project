package org.xsalefter.world.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.xsalefter.world.entity.City;


@Entity
@Table(name="country")
public class Country implements Serializable {

	private static final long serialVersionUID = -8202593814511611125L;

	private String code;
	private City capitalCity;
	private Set<City> cities;
	
	public Country() {}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public City getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(City capitalCity) {
		this.capitalCity = capitalCity;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
}
