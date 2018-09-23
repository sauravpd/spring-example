package spring_example.service;

import java.util.List;

import spring_example.model.Customer;

/**
 * Customer Service
 * @author saurav
 *
 */
public interface CustomerService {

	List<Customer> findAll();

}