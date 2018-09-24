package spring_example.repository;

import java.util.List;

import spring_example.model.Customer;

public interface CustomerRepository 
{
	public List<Customer> findAll();
}