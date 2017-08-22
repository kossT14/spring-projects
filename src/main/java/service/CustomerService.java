package service;

import model.Customer;
import repository.CustomerRepository;

import java.util.List;

/**
 * Created by koss on 22-Aug-17.
 */
public class CustomerService {

    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
