package com.jspiders.Esop.Repository;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Entity.Grant;

@Repository
public interface GrantRepository extends JpaRepository<Grant, Long> {

	
	@Query("from Grant where grantNumber=:grantNumber")
	Grant findByGrantNumber(@PathParam("grantNumber") String grantNumber);
	
	@Transactional
	@Modifying
	@Query("delete from Grant where grantNumber=:grantNumber")
	int deleteByGrantNumber(@PathParam("grantNumber") String grantNumber);
	
}
