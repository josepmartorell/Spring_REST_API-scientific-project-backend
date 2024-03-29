package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Scientific;

public interface IScientificService {	
	//CRUD methods
	public List<Scientific> listScientifics();//READ All 	
	public Scientific saveScientific(Scientific scientific);//CREATE	
	public Scientific scientificXID(int id);//READ	
	public Scientific updateScientific(Scientific scientific);//UPDATE	
	public void eliminateScientific(int id);//DELETE

}
