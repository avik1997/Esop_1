package com.jspiders.Esop.Repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

	@Query("from Plan where planYear=:planYear")
	Plan findByYear(@PathParam("planYear") String planYear);
}
