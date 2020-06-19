package com.ibm.expensemanager.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.ibm.expensemanager.application.bean.UserTransaction;

@Repository
public interface UserRepository extends CrudRepository<UserTransaction, Integer> {
	
	
	
	@Query(value = "SELECT * FROM user_transaction WHERE date Like %?1%", nativeQuery = true)
	List<Match> findByMatchMonthAndMatchDay(@Param ("date") String date);	
}
