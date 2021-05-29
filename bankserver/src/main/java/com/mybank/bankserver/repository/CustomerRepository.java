package com.mybank.bankserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybank.bankserver.entity.CustomerEntity;



@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
