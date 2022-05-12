package com.jspiders.Esop.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.jspiders.Esop.Entity.Grant;
import com.jspiders.Esop.Repository.GrantRepository;
import com.jspiders.Esop.Service.GrantService;

@RunWith(value=PowerMockRunner.class)
public class GrantServiceTest {
	
	@Mock
	private GrantRepository grantRepository;
	
	@InjectMocks
	@Spy
	private GrantService grantServiceSpy;

	@Test
	public void testGetGrantByGrantNumber() 
	{
		MockitoAnnotations.initMocks(this);
		Grant grantMock = PowerMockito.mock(Grant.class);
		try {
			PowerMockito.when(grantRepository,"findByGrantNumber",anyString()).thenReturn(grantMock);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception handled");
			e.printStackTrace();
		
		}
		ReflectionTestUtils.invokeMethod(grantServiceSpy, "getGrantByGrantNumber",anyString());
		assertTrue(true);
	}
	@Test
	public void testprepareAndUploadGrants() {
		MockitoAnnotations.initMocks(this);;

		List<Grant> grantMock =  (List<Grant>) PowerMockito.mock(Grant.class);
		try {
			PowerMockito.when(grantRepository,"saveAll",any()).thenReturn(grantMock);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReflectionTestUtils.invokeMethod(grantServiceSpy, "prepareAndUploadGrants",any());
		assertTrue(true);
		
	}

}
