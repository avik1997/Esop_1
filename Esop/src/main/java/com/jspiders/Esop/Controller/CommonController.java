package com.jspiders.Esop.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.Esop.AppConstants.AppConstants;
import com.jspiders.Esop.Dto.AllocationDto;
import com.jspiders.Esop.Entity.Employee;
import com.jspiders.Esop.Entity.Plan;
import com.jspiders.Esop.Service.CommonService;

@RestController
@RequestMapping(value =AppConstants.COMMON_CONTROLLER)
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	@GetMapping(value = AppConstants.GET_EMPLOYEE_BY_NAME)
	public @ResponseBody Employee getEmployeeByName( String name) {
		
		return commonService.getEmployeeByName(name);
	}
	@GetMapping(value = AppConstants.GET_PLAN_BY_ID)
	public @ResponseBody Optional<Plan> getPlanById( Long id) {
		return commonService.getPlanById(id);
	}
	@GetMapping(value = AppConstants.GET_PLAN_BY_YEAR)
	public @ResponseBody Plan getPlanByYear( String planYear) {
		return commonService.getPlanByYear(planYear);
	}
	
	@PostMapping(value=AppConstants.SAVE_PLAN_DETAILS)
	public void savePlan(@RequestBody Plan plan)
	{
		commonService.savePlan(plan);
	}
	@PostMapping(value=AppConstants.SAVE_EMPLOYEE_DETAILS)
	public void saveEmployee(@RequestBody Employee employee)
	{
		commonService.saveEmployee(employee);
	}
	
	@GetMapping(value=AppConstants.GET_SUM_OF_GRANT_ALLOCATED)
  public @ResponseBody AllocationDto getSumOfGrantAllocated() {
		
		return commonService.getSumOfGrantAllocated();
	}
	
}
