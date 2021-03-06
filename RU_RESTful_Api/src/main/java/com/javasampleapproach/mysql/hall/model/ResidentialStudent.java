package com.javasampleapproach.mysql.hall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "residencestudent" )
public class ResidentialStudent implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "num_of_residence_student")
	private String num_of_residence_student;
	
	@Column(name = "name_of_residence_student")
	private String name_of_residence_student;
	
	@Column(name = "contact_of_residence_student")
	private String contact_of_residence_student;
	
	@Column(name = "room_num_of_residence_student")
	private String room_num_of_residence_student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNum_of_residence_student() {
		return num_of_residence_student;
	}

	public void setNum_of_residence_student(String num_of_residence_student) {
		this.num_of_residence_student = num_of_residence_student;
	}

	public String getName_of_residence_student() {
		return name_of_residence_student;
	}

	public void setName_of_residence_student(String name_of_residence_student) {
		this.name_of_residence_student = name_of_residence_student;
	}

	public String getContact_of_residence_student() {
		return contact_of_residence_student;
	}

	public void setContact_of_residence_student(String contact_of_residence_student) {
		this.contact_of_residence_student = contact_of_residence_student;
	}

	public String getRoom_num_of_residence_student() {
		return room_num_of_residence_student;
	}

	public void setRoom_num_of_residence_student(String room_num_of_residence_student) {
		this.room_num_of_residence_student = room_num_of_residence_student;
	}

	@Override
	public String toString() {
		return "ResidentialStudent [id=" + id + ", num_of_residence_student=" + num_of_residence_student
				+ ", name_of_residence_student=" + name_of_residence_student + ", contact_of_residence_student="
				+ contact_of_residence_student + ", room_num_of_residence_student=" + room_num_of_residence_student
				+ "]";
	}
	
	
	
}