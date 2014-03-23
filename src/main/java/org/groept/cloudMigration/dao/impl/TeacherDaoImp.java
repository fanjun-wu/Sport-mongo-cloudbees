package org.groept.cloudMigration.dao.impl;

import java.util.List;

import org.groept.cloudMigration.dao.TeacherDao;
import org.groept.cloudMigration.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImp implements TeacherDao{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Teacher arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Teacher> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Teacher> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Teacher> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
