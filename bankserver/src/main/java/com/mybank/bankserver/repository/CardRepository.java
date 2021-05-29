package com.mybank.bankserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mybank.bankserver.entity.CardEntity;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

	@Query("select c from CardEntity c where c.custId = :custId")
	public List<CardEntity> findByCustId(@Param("custId") Long custId);
}
