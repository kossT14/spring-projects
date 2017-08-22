package repository;

import model.Customer;

import java.util.List;

/**
 * Created by koss on 22-Aug-17.
 */
public interface CustomerRepository {

    public List<Customer> findAll();
}
