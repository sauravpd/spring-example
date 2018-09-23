package spring_example.service;

import java.util.List;

import spring_example.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}