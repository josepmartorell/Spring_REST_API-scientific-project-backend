package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IAssignmentDAO;
import com.crud.sql.dto.Assignment;

@Service
public class AssignmentServiceImpl implements IAssignmentService{
	
	@Autowired
	IAssignmentDAO iAssignedDAO;

	@Override
	public List<Assignment> listAssignments() {
		return iAssignedDAO.findAll();
	}

	@Override
	public Assignment saveAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		return iAssignedDAO.save(assignment);
	}

	@Override
	public Assignment assignmentXID(int id) {
		return iAssignedDAO.findById(id).get();
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		return iAssignedDAO.save(assignment);
	}

	@Override
	public void eliminateAssignment(int id) {
		// TODO Auto-generated method stub
		iAssignedDAO.deleteById(id);
	}

}
