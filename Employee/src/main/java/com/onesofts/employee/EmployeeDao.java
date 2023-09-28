package com.onesofts.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository empRepo;
public String addEmp(Employee e) {
	empRepo.save(e);
	return "Successfully Saved";
}


public String addEmps(List<Employee> emps) {
	empRepo.saveAll(emps);
	return "Successfully Saved";
}

public Employee findId(int id) throws EmployeeNotFoundException {
	return empRepo.findById(id).orElseThrow(()->new EmployeeNotFoundException());
	
}
public List<Employee> getAge(int age)throws EmployeeAgeNotFoundException {
		return empRepo.getAge(age);
				
}
public List<Employee> getName(String name)throws EmployeeNameNotFoundException {
	return empRepo.getName(name);
}
public List<Employee> getSalary(int salary)throws EmployeeSalaryNotFoundException {
	return empRepo.getSalary(salary);
}
public List<Employee> getPhNo(long phNo)throws EmployeePhNoNotFoundException {
	return empRepo.getPhNo(phNo);
}
public List<Employee> findlist() {
	return empRepo.findAll();
}
public String deleteId(int id) {
	empRepo.deleteById(id);
	return "Successfully Delete";
}
public String update(Employee id) {
	empRepo.save(id);
	return "Successfully Update";
}
public String patch(int id, String name) {
	Employee c=empRepo.findById(id).get();
	c.setName(name);
	return "Successfully";
}
}


