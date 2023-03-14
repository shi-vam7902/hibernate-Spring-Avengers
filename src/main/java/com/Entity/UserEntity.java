package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
//	private String cityName;
	
//	@ManyToOne
//	RoleEntity role;
//	
//	public RoleEntity getRole() {
//		return role;
//	}
//	public void setRole(RoleEntity role) {
//		this.role = role;
//	}
//	public String getCountryName() {
//		return countryName;
//	}
//	public void setCountryName(String countryName) {
//		this.countryName = countryName;
//	}
//	
//	@Column(name="countryName")
//	private String countryName;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public String getCountry() {
//		return countryName;
//	}
//	public void setCountry(String country) {
//		this.countryName = country;
//	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getCityName() {
//		return cityName;
//	}
//	public void setCityName(String cityName) {
//		this.cityName = cityName;
//	} 
}
