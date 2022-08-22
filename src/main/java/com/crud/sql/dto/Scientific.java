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
@Table(name="scientific")
public class Scientific {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "surname_name")
	private String surname_name;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Assignment> assignment;

	/**
	 * void constructor
	 */
	public Scientific() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the surname_name
	 */
	public String getSurname_name() {
		return surname_name;
	}

	/**
	 * @param surname_name the surname_name to set
	 */
	public void setSurname_name(String surname_name) {
		this.surname_name = surname_name;
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
		return "Scientific [id=" + id + ", surname_name=" + surname_name + ", assignment=" + assignment + "]";
	}
	
	
	

}
