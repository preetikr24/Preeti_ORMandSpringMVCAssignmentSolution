package com.crm.mgmt.Dao;

import java.util.List;

import com.crm.mgmt.model.Crm;

public interface crmDao {
	
	public void SaveOrUpdate(Crm crm);
	
	public void delete(int id);
	
	public Crm getByid(int id);
	
	public List<Crm> showAll(); 

}
