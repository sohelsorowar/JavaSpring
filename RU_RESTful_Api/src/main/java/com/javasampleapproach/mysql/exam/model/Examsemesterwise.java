package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examsemesterwise" )
public class Examsemesterwise implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "semester_info")
	private String semester_info;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSemester_info() {
		return semester_info;
	}


	public void setSemester_info(String semester_info) {
		this.semester_info = semester_info;
	}


	@Override
	public String toString() {
		return "Examsemesterwise [id=" + id + ", semester_info=" + semester_info + "]";
	}
	
	
	
	
}