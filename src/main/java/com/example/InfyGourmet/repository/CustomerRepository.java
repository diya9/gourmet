package com.example.InfyGourmet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InfyGourmet.dto.Customer;

@Repository
public interface CustomerRepository extends  JpaRepository<Customer, Long>{

}
