package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
		void insert(Department dp);
		void update(Department dp);
		void DeleteById(Integer id);
		Department findById(Integer id);
		List<Department>findAll();	
}
