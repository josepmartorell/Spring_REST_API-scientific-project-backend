package com.crud.sql.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.id.Assigned;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "project_name")
	private String project_name;
	@Column(name = "project_hours")
	private String project_hours;
	
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Assignment> assignment;


	/**
	 * void constructor
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param project_name
	 * @param project_hours
	 * @param assignment
	 */
	public Project(int id, String project_name, String project_hours, List<Assignment> assignment) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.project_hours = project_hours;
		this.assignment = assignment;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the project_name
	 */
	public String getProject_name() {
		return project_name;
	}


	/**
	 * @param project_name the project_name to set
	 */
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	/**
	 * @return the project_hours
	 */
	public String getProject_hours() {
		return project_hours;
	}


	/**
	 * @param project_hours the project_hours to set
	 */
	public void setProject_hours(String project_hours) {
		this.project_hours = project_hours;
	}


	/**
	 * @return the assignment
	 */
	public List<Assignment> getAssignment() {
		return assignment;
	}


	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(List<Assignment> assignment) {
		this.assignment = assignment;
	}


	@Override
	public String toString() {
		return "Project [id=" + id + ", project_name=" + project_name + ", project_hours=" + project_hours
				+ ", assignment=" + assignment + "]";
	}


	
}
