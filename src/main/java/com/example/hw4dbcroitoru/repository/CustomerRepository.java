package com.example.hw4dbcroitoru.repository;

import com.example.hw4dbcroitoru.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
public List<Customer> findAll();
}
