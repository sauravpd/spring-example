package spring_example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee 
{
	@Value("${name}")
	private String empName;
	
	@Value("${id}")
	private int empNo;
	
	public String getEmpName() {
		return empName;
	}
	public int getEmpNo() {
		return empNo;
	}

}
