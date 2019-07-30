package com.service.family.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="families")
public class Family implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="family_id")
	private int FamilyId;
	
	@Column(name="head_of_family_parent_id")
	private int HeadParentId;
	
	@Column(name="family_name")
	private String FamilyName;

	public int getFamilyId() {
		return FamilyId;
	}

	public void setFamilyId(int familyId) {
		FamilyId = familyId;
	}

	public int getHeadParentId() {
		return HeadParentId;
	}

	public void setHeadParentId(int headParentId) {
		HeadParentId = headParentId;
	}

	public String getFamilyName() {
		return FamilyName;
	}

	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}
	
	
	

}
