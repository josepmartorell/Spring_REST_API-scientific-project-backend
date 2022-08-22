package com.crud.sql.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="assignments")
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "scientific_id")
    private Scientific scientific;
 
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredAt;

	/**
	 * 
	 */
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param scientific
	 * @param project
	 * @param registeredAt
	 */
	public Assignment(Scientific scientific, Project project, Date registeredAt) {
		super();
		this.scientific = scientific;
		this.project = project;
		this.registeredAt = registeredAt;
	}

	/**
	 * @return the scientific
	 */
	public Scientific getScientific() {
		return scientific;
	}

	/**
	 * @param scientific the scientific to set
	 */
	public void setScientific(Scientific scientific) {
		this.scientific = scientific;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the registeredAt
	 */
	public Date getRegisteredAt() {
		return registeredAt;
	}

	/**
	 * @param registeredAt the registeredAt to set
	 */
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}

	@Override
	public String toString() {
		return "Assignment [scientific=" + scientific + ", project=" + project + ", registeredAt=" + registeredAt + "]";
	}
	
	
	
	
	
	

}
