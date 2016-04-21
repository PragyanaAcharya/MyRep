package com.testapp.service;

/**
 * @author d.kumar.samantaray
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.TestAppDAO;

@Service("mercuryService")
public class TestAppServiceImpl implements TestAppService{

	@Autowired
	TestAppDAO mercuryAppDAO;
	
	public String getUserService(){
		System.out.println("Hey It's Service layer getUserService method ..");
		mercuryAppDAO.getUserDao();
		return null;
	}

	public String searchByJobIdService(String jobId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
