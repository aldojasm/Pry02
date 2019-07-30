package com.service.family.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int StudentId;
	
	@Column(name="gendet")
	private Boolean Gender;
	
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="middle_name")
	private String MiddleName;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="date_of_birth")
	private Date DateBirth;
	
	@Column(name="other_student_details")
	private Date OtherDetails;

	
	
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
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

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getDateBirth() {
		return DateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		DateBirth = dateBirth;
	}

	public Date getOtherDetails() {
		return OtherDetails;
	}

	public void setOtherDetails(Date otherDetails) {
		OtherDetails = otherDetails;
	}
	
		
}
