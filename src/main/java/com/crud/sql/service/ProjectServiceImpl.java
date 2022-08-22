package com.crud.sql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.sql.dao.IProjectDAO;
import com.crud.sql.dto.Project;

@Service
public class ProjectServiceImpl implements IProjectService{
	
	IProjectDAO iProjectDAO;

	@Override
	public List<Project> listProjects() {
		// TODO Auto-generated method stub
		return iProjectDAO.findAll();
	}

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return iProjectDAO.save(project);
	}

	@Override
	public Project projectXID(int id) {
		// TODO Auto-generated method stub
		return iProjectDAO.findById(id).get();
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		return iProjectDAO.save(project);
	}

	@Override
	public void eliminateProject(int id) {
		// TODO Auto-generated method stub
		iProjectDAO.deleteById(id);
	}
	
	

}
