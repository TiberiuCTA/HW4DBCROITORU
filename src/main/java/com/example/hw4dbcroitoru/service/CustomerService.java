package com.example.hw4dbcroitoru.service;

import com.example.hw4dbcroitoru.Model.Customer;
import com.example.hw4dbcroitoru.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    List<Customer> list = new ArrayList<>();

    public Customer getById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Integer id,Customer customer) {
        try {
            Customer newCustomer = customerRepository.findById(id).get();
            newCustomer.setName(customer.getName());
            newCustomer.setEmail(customer.getEmail());
            return customerRepository.save(newCustomer);

        } catch (Exception e) {
            System.out.println("The customer with this id does not exist");
            return null;
        }
    }


    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }
}




