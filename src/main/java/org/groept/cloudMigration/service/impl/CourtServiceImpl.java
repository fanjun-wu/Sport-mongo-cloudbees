package org.groept.cloudMigration.service.impl;

import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.dao.CourtDao;
import org.groept.cloudMigration.dao.HallDao;
import org.groept.cloudMigration.model.Court;
import org.groept.cloudMigration.model.Hall;
import org.groept.cloudMigration.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourtServiceImpl implements CourtService{

	@Autowired
	private CourtDao courtDao;
	@Autowired
	private HallDao hallDao;
	
	@Override
	public void saveCourt(Court court) {
		// TODO Auto-generated method stub
		courtDao.save(court);
	}
	@Override
	public void editCourt(Court court) {
		// TODO Auto-generated method stub
		courtDao.save(court);
	}

	@Override
	public void deleteCourt(ObjectId courtId) {
		// TODO Auto-generated method stub
		courtDao.delete(courtDao.findById(courtId));
	}

	@Override
	public Court getCourt(ObjectId courtId) {
		// TODO Auto-generated method stub
		return courtDao.findById(courtId);
	}
	@Override
	public List getCourts() {
		// TODO Auto-generated method stub
		return (List) courtDao.findAll();
	}
	@Override
	public Hall getHall() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Court getCourtByName(String _nameOfCourtRecieved) {
		// TODO Auto-generated method stub
		return courtDao.findByname(_nameOfCourtRecieved);
	}
	@Override
	public void saveAllCourt(Set<Court> allCourts) {
		// TODO Auto-generated method stub
		courtDao.save(allCourts);
	}

	
}
