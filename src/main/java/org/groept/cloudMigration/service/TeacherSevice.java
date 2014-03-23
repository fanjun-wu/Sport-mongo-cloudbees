package org.groept.cloudMigration.service;

import java.util.List;





import org.groept.cloudMigration.model.Teacher;

public interface TeacherSevice {

	public List<Teacher> findbyName(String username);
	public void add(Teacher teacher);
	public void edit(Teacher teacher);
	
	
	public List getAllTeacher();
	public void delete(Teacher teacher);
	public Teacher getTeacher(long teacherId);
	
}
