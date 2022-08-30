package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Project;
import com.crud.sql.dto.Scientific;
import com.crud.sql.service.ScientificServiceImpl;

@RestController
@RequestMapping(name="/api")
public class ScientificController {
	
	@Autowired
	ScientificServiceImpl iScientificServiceImpl;
	
	@GetMapping("/scientifics")
	public List<Scientific> listScientifics(){
		return iScientificServiceImpl.listScientifics();		
	}
	
	@PostMapping("/scientifics")
	public Scientific saveScientific(@RequestBody Scientific scientific) {
		return iScientificServiceImpl.saveScientific(scientific);
	}
	
	@GetMapping("/scientifics/{id}")
	public Scientific scientificXID(@PathVariable(name="id") int id) {
		Scientific scientific_xid = new Scientific();
		scientific_xid = iScientificServiceImpl.scientificXID(id);
		return scientific_xid;
	}
	
	@PutMapping("/scientifics/{id}")
	public Scientific updateScientific(@PathVariable(name="id")int id,@RequestBody Scientific scientific) {
		Scientific scientific_selected = new Scientific();
		Scientific scientific_updated = new Scientific();
		
		scientific_selected = iScientificServiceImpl.scientificXID(id);		
		scientific_selected.setSurname_name(scientific.getSurname_name());
		scientific_selected.setAssignment(scientific.getAssignment());		
		scientific_updated = iScientificServiceImpl.updateScientific(scientific_selected);
		return scientific_updated;
	}
	
	@DeleteMapping("/scientifics/{id}")
	public void eliminateScientific(@PathVariable(name="id") int id) {
		iScientificServiceImpl.eliminateScientific(id);
	}

}
