package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface CrAllocationDetailsRepository extends JpaRepository<User,Double>{
	
	
	@Query(value="call pe_Get_Cr_Allocation_Details(?1)",nativeQuery=true)
    List<Object[]> getcreditallocdetails(BigDecimal paypointid);
}
