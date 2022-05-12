package com.jspiders.Esop.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.Esop.Dto.GrantDto;
import com.jspiders.Esop.Entity.AllocationClass;
import com.jspiders.Esop.Entity.Employee;
import com.jspiders.Esop.Entity.Grant;
import com.jspiders.Esop.Repository.AllocationRepository;
import com.jspiders.Esop.Repository.GrantRepository;

@Service
public class GrantService {
	
	@Autowired
	private  GrantRepository grantRepository;
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private AllocationRepository allocationRepository;
	
	public void saveGrantDetails(Grant grant) {
		grantRepository.save(grant);
	}
	public List<Grant> getAllGrant()
	{
		return grantRepository.findAll();
	}

	public  Grant getGrantByGrantNumber(String grantNumber) {
		
		return grantRepository.findByGrantNumber(grantNumber);
		
	}
	public Optional<Grant> getMovieById(Long id)
	{
		return grantRepository.findById(id);
	}
	
	
	public void updateGrantById(GrantDto grantDto,Long id)
	{
	}
	public int deleteGrantByGrantNumber(String grantNumber) {
		
	return 	grantRepository.deleteByGrantNumber(grantNumber);
	
	}
	public void prepareAndUploadGrants(List<GrantDto> list) {
		List<Grant> array = new ArrayList<Grant>();
		list.forEach(each->{
			Grant g=new Grant();
			g.setGrantNumber(each.getGrantNumber());
			g.setAccepted(each.isAccepted());
			g.setAcceptedDate(each.getAcceptedDate());
			g.setEmployee(commonService.getEmployeeByName(each.getEmployee()));
			g.setGrantDate(each.getGrantDate());
			g.setGrantedBy(commonService.getEmployeeByName(each.getGrantedBy()));
			g.setGrantStatus(each.getGrantStatus());
			g.setPlan(commonService.getPlanByYear(each.getPlan()));
			g.setNoOfGrants(each.getNoOfGrants());
			array.add(g);
			System.out.println(array);
		});
		grantRepository.saveAll(array);
	}

	/* we are updating the grant status and assingning to the allocalion class*/
	
	public void updateGrantStatus(String grantNumber) {
	//	AllocationClass allocationClass = new AllocationClass();
		List<AllocationClass> list = new ArrayList<AllocationClass>();
		System.out.println(grantNumber);
		Grant grant = getGrantByGrantNumber(grantNumber);
		System.out.println(grant);
		Employee employee = grant.getEmployee();
		String bond = employee.getBond();
		int bondNumber=Integer.parseInt(bond);
		System.out.println(bondNumber);
		if(bondNumber<5)
		{
			AllocationClass allocationClass = new AllocationClass();
			grant.setAccepted(true);
			grant.setAcceptedDate(new Date());
			allocationClass.setGrantAllocation(grant.getNoOfGrants());
			allocationClass.setGrant(grant);
			allocationClass.setAllocatedYear("2023");
			allocationClass.setStatus("pending");
			allocationClass.setGrant(grant);
			allocationClass.setAllocatedDate(new Date());
			allocationRepository.save(allocationClass);
			
		}
		else { 
			for(int i=0;i<5;i++)
			{
			AllocationClass allocationClass = new AllocationClass();
			grant.setAccepted(true);
			grant.setAcceptedDate(new Date());
			String noOfGrants = grant.getNoOfGrants();
			int grantCount=Integer.parseInt(noOfGrants);
			int yearGrant=grantCount/5;
			String yearPart=yearGrant+"";
			allocationClass.setGrantAllocation(yearPart);
			allocationClass.setGrant(grant);
			int year = Calendar.YEAR+i;
			String s=year+"";
			allocationClass.setAllocatedYear(s);
			allocationClass.setStatus("pending");
			allocationClass.setGrant(grant);
			allocationClass.setAllocatedDate(new Date());
			list.add(allocationClass);
			}
			allocationRepository.saveAll(list);
		
		}
	}
	
}