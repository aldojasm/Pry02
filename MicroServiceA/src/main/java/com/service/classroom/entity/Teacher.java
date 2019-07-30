package com.service.classroom.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="teachers_id")
	private int TeacherId;
	
	@Column(name="school_id")
	private int SchoolId;
	
	@Column(name="gender")
	private Boolean Gender;
	
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="middle_name")
	private String MiddleName;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="other_teacher_datails")
	private String OtherTeacherDetails;

	public int getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}

	public int getSchoolId() {
		return SchoolId;
	}

	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
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

	public String getOtherTeacherDetails() {
		return OtherTeacherDetails;
	}

	public void setOtherTeacherDetails(String otherTeacherDetails) {
		OtherTeacherDetails = otherTeacherDetails;
	}
	
	
	
}
