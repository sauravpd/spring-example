package spring_example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_example.model.Customer;
import spring_example.repository.CustomerRepository;

/**
 * CustomerServiceImpl class
 * @author saurav
 *
 */
@Component("customerService")
public class CustomerServiceImpl implements CustomerService 
{

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}
	
}
