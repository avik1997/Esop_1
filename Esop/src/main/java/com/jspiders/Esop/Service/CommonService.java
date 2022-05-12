package com.jspiders.Esop.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;
import org.springframework.stereotype.Service;

import com.jspiders.Esop.Dto.AllocationDto;
import com.jspiders.Esop.Entity.Employee;
import com.jspiders.Esop.Entity.Plan;
import com.jspiders.Esop.Repository.EmployeeRepository;
import com.jspiders.Esop.Repository.MySqlImplementation;
import com.jspiders.Esop.Repository.MySqlService;
import com.jspiders.Esop.Repository.PlanRepository;

@Service
public class CommonService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PlanRepository planRepository;
	
	@Autowired
	private MySqlService implementation;
	
	
	public AllocationDto getSumOfGrantAllocated() {
		
		return implementation.getAllocationSum();
	}

	
public Employee getEmployeeByName(String name) {
	
	return	employeeRepository.findByName(name);
		
	}
public Optional<Plan> getPlanById(Long id) {
   return planRepository.findById(id);
}
public Plan getPlanByYear(String planYear) {
	return planRepository.findByYear(planYear);
}
public void savePlan(Plan plan)
{
	planRepository.save(plan);
}
public void saveEmployee(Employee employee)
{
	employeeRepository.save(employee);
}


}
