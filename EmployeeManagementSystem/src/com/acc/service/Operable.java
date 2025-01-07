package com.acc.service;
import java.util.List;
import com.acc.model.Employee;
public interface Operable {
	public List<Employee> findAll();
	public Employee find(int id);
	public void delete(int id);
	public void deleteAll();
	public void add(Employee emp);
	public void updateAge(int id,int age);
	public void updateSalary(int id,float salary);
	public void increaseSalary(float per);
}
