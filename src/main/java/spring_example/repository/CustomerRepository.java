package spring_example.repository;

import java.util.List;

import spring_example.model.Customer;

/**
 * Customer Repository
 * @author saurav
 *
 */
public interface CustomerRepository 
{
	public List<Customer> findAll();
}