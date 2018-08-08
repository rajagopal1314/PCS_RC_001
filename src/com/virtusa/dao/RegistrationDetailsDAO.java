package com.virtusa.dao;

import java.sql.PreparedStatement;

import com.virtusa.entity.RegistratioDetails;
import com.virtusa.util.DBUtil;

public class RegistrationDetailsDAO {
	
	private DBUtil dBUtil = new DBUtil();
	private PreparedStatement ps = null;
	
	private PreparedStatement getStatement(String query) throws Exception {
		ps = dBUtil.getConnection().prepareStatement(query);
		return ps;
	}
	
	public void save(RegistratioDetails registrationDetails) throws Exception {
		String sql = "insert into arrivals values (?,?,?,?)";
		ps.setString(1, registrationDetails.getFirstName());
		ps.setString(2, registrationDetails.getLastName());
		ps.setString(3, registrationDetails.getPhoneNumber().toString());
		ps.setString(4, registrationDetails.getEmail());

		getStatement(sql).execute();
		dBUtil.closeConnection();
	}
	
	public void update(RegistratioDetails registratioDetails) {
		
	}
	
	/*public List<RegistratioDetails> getAll() {
		
	}
	
	public RegistratioDetails get(String name) {
		
	}
*/
}
