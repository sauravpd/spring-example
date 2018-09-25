package spring_example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring_example.model.Customer;

@Component("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository
{
	@Value("${DBuserName}")
	private String dbUserName;

	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList<>();

		Customer customer=new Customer();
		customer.setFirstName("Mark");
		customer.setLastName("Smith");

		customers.add(customer);
		return customers;
	}
}
