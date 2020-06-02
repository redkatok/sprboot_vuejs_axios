package app.core.controller;

import app.core.dto.Customer;
import app.core.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/list")
    public List<Customer> findAll(){
        return customerRepository.getAllCustomers();
    }


    @GetMapping("/one/{id}")
    public Customer findOne(@PathVariable Integer id){
        return customerRepository.getAllCustomers().get(id);
    }
}
