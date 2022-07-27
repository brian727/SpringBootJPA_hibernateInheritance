package com.brian.springdata.hibernateinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.brian.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
