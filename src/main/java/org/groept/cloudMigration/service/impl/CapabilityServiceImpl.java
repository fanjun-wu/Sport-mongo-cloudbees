package org.groept.cloudMigration.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.dao.CapabilityDao;
import org.groept.cloudMigration.model.Capability;
import org.groept.cloudMigration.service.CapabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class CapabilityServiceImpl  implements CapabilityService{

	
	@Autowired
	private CapabilityDao capabilityDao;
	
	@Override
	public void saveCapability(Capability capability) {
		// TODO Auto-generated method stub
		capabilityDao.save(capability);
	}
	@Override
	public void editCapability(Capability capability) {
		// TODO Auto-generated method stub
		capabilityDao.save(capability);
	}

	@Override
	public void deleteCapability(ObjectId capabilityId) {
		// TODO Auto-generated method stub
		capabilityDao.delete(capabilityDao.findById(capabilityId));
	}

	@Override
	public Capability getCapability(ObjectId capabilityId) {
		// TODO Auto-generated method stub
		return capabilityDao.findById(capabilityId);
	}
	@Override
	public List getCapabilities() {
		// TODO Auto-generated method stub
		return (List) capabilityDao.findAll();
	}
}
