package org.groept.cloudMigration.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.dao.AdminDao;
import org.groept.cloudMigration.model.Admin;
import org.groept.cloudMigration.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
	}
	@Override
	public void editAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
	}

	@Override
	public void deleteAdmin(ObjectId adminId) {
		// TODO Auto-generated method stub
		adminDao.delete(adminDao.findById(adminId));
	}

	@Override
	public Admin getAdmin(ObjectId adminId) {
		// TODO Auto-generated method stub
		return adminDao.findById(adminId);
	}
	@Override
	public List getAdmins() {
		// TODO Auto-generated method stub
		return (List) adminDao.findAll();
	}

	
}
