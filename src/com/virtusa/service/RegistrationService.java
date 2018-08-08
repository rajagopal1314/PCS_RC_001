package com.virtusa.service;

import com.virtusa.dao.RegistrationDetailsDAO;
import com.virtusa.entity.RegistratioDetails;

public class RegistrationService {
	
	private RegistrationDetailsDAO rdDao = new RegistrationDetailsDAO();
	
	public void register(RegistratioDetails rd) throws Exception {
		rdDao.save(rd);
	}
}
