package com.jspiders.Esop.Repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
	@Query("from Employee where name=:name")
	Employee findByName(@PathParam("name") String name);

}
