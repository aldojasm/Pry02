package com.service.family.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parents")
public class Parent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="parent_id")
	private int ParentId;
	
	@Column(name="gender")
	private Boolean Gender;
	
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="middle_name")
	private String Middle_name;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="other_parent_details")
	private String OtherDetails;

	public int getParentId() {
		return ParentId;
	}

	public void setParentId(int parentId) {
		ParentId = parentId;
	}

	public Boolean getGender() {
		return Gender;
	}

	public void setGender(Boolean gender) {
		Gender = gender;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddle_name() {
		return Middle_name;
	}

	public void setMiddle_name(String middle_name) {
		Middle_name = middle_name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getOtherDetails() {
		return OtherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		OtherDetails = otherDetails;
	}
	

}
