package org.groept.cloudMigration.dao;



import org.groept.cloudMigration.model.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherDao extends CrudRepository<Teacher, Long> {
    List<Teacher> findByUsername(String username);
}
