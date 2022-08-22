package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Project;

public interface IProjectService {
	//CRUD methods
	public List<Project> listProjects();//READ All 	
	public Project saveProject(Project project);//CREATE	
	public Project projectXID(int id);//READ	
	public Project updateProject(Project project);//UPDATE	
	public void eliminateProject(int id);//DELETE
}
