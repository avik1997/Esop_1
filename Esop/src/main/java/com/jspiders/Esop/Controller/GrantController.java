package com.jspiders.Esop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.Esop.AppConstants.AppConstants;
import com.jspiders.Esop.Dto.GrantDto;
import com.jspiders.Esop.Entity.AllocationClass;
import com.jspiders.Esop.Entity.Grant;
import com.jspiders.Esop.Service.GrantService;
@RestController
@Controller
@RequestMapping(value = AppConstants.COMMON_CONTROLLER)
public class GrantController  {
	@Autowired
	private GrantService grantService;
	

	@PostMapping(value = AppConstants.PREPARE_AND_UPLOAD_GRANTS)
	public void uploadGrants(@RequestBody List<GrantDto> list) {
		System.out.println(list);
		grantService.prepareAndUploadGrants(list);
	}
	
	@PostMapping(value=AppConstants.UPDATE_GRANT_STATUS)
	public void updateGrantStatus(@RequestBody String grantNumber) {
		grantService.updateGrantStatus(grantNumber); 
	}

	/*
	 * @PostMapping(value=AppConstants.SAVE_GRANT_DETAILS) public void
	 * saveGrantDetails(@RequestBody Grant grant) {
	 * grantService.saveGrantDetails(grant);
	 * 
	 * }
	 */
	@GetMapping(value = AppConstants.GET_ALL_GRANT)
	public @ResponseBody List<Grant> getAllGrant()
	{
		List<Grant> list = grantService.getAllGrant();
		System.out.println(list);
		return list;
	}
	@GetMapping(value=AppConstants.GET_GRANT_BY_GRANT_NUMBER)
	public @ResponseBody  Grant getGrantByGrantNumber(String grantNumber) {
		
	Grant number = grantService.getGrantByGrantNumber(grantNumber);
	System.out.println(number);
	return number;
		
	}
	@PostMapping(value=AppConstants.UPDATE_GRANT_BY_ID)
	public void updateGrantById(@RequestBody  GrantDto grantdto, Long id) {
		System.out.println(grantdto);
	grantService.updateGrantById(grantdto, id);
	}
	
	@DeleteMapping(value=AppConstants.DELETE_GRANT_BY_GRANT_NUMBER)
	public int deleteGrantByGrantNumber(@RequestParam("grantNumber") String grantNumber) {
		int i = grantService.deleteGrantByGrantNumber(grantNumber);
		System.out.println(i);
		return i;
	}
	
	
}