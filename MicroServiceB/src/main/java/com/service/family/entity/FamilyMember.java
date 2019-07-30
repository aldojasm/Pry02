package com.service.family.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="family_members")
public class FamilyMember implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="family_member_id")
	private int FamilyMemberId;
	
	@Column(name="family_id")
	private int FamilyId;
	
	@Column(name="parent_or_student_member")
	private String ParentMember;
	
	@Column(name="parent_id")
	private int ParentId;
	
	@Column(name="student_id")
	private int StudentId;

	public int getFamilyMemberId() {
		return FamilyMemberId;
	}

	public void setFamilyMemberId(int familyMemberId) {
		FamilyMemberId = familyMemberId;
	}

	public int getFamilyId() {
		return FamilyId;
	}

	public void setFamilyId(int familyId) {
		FamilyId = familyId;
	}

	public String getParentMember() {
		return ParentMember;
	}

	public void setParentMember(String parentMember) {
		ParentMember = parentMember;
	}

	public int getParentId() {
		return ParentId;
	}

	public void setParentId(int parentId) {
		ParentId = parentId;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
	
}
