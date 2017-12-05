package com.management.server1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 9101926477705498097L;
	private Integer id;
	private String name;
	private String prename;
	private String passed_practice_project;
	private String passed_bachelor_thesis;
	private String passed_colloquium;
	
	@Column
	public String getPassed_bachelor_thesis() {
		return passed_bachelor_thesis;
	}

	public void setPassed_bachelor_thesis(String passed_bachelor_thesis) {
		this.passed_bachelor_thesis = passed_bachelor_thesis;
	}

	@Column
	public String getPassed_colloquium() {
		return passed_colloquium;
	}

	public void setPassed_colloquium(String passed_colloquium) {
		this.passed_colloquium = passed_colloquium;
	}

	
	
	@Column
	public String getPassed_practice_project() {
		return passed_practice_project;
	}

	public void setPassed_practice_project(String passed_practice_project) {
		this.passed_practice_project = passed_practice_project;
	}

	
	

	@Id
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length = 50 , nullable = false , unique = true)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length = 50 , nullable = false , unique = true)
	public String getPrename() {
		return prename;
	}
	
	public void setPrename(String prename) {
		this.prename = prename;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + ", prename=" + prename + "]";
	}
	
}
