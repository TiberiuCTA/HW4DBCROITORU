package com.example.hw4dbcroitoru.Controllers;


import com.example.hw4dbcroitoru.Model.Customer;
import com.example.hw4dbcroitoru.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @GetMapping("/{id}")
    public Customer getById(@PathVariable("id") Integer id) {
        return customerService.getById(id);}


@PutMapping("{id}")
public Customer updateCustomer(@PathVariable Integer id,@RequestBody Customer customer)
{
    return customerService.updateCustomer(id,customer);
}
@DeleteMapping("/{id}")
void deleteCustomer(@PathVariable Integer id) {
    customerService.deleteById(id);
}
    }




