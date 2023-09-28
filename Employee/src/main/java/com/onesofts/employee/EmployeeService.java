package com.onesofts.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeDao empDao;
public String addEmp(Employee e) {
	return empDao.addEmp(e);
}


public String addEmps(List<Employee> emps) {
	return empDao.addEmps(emps);
}

public Employee findId(int id)throws EmployeeNotFoundException {
    return empDao.findId(id);
}
public List<Employee> getAge(int age)throws EmployeeAgeNotFoundException {
	List<Employee> l=empDao.getAge(age);
	if(l.isEmpty()) {
		throw new EmployeeAgeNotFoundException();
	} else {
		return l;
	}
}
public List<Employee> getName(String name)throws EmployeeNameNotFoundException {
	List<Employee> l=empDao.getName(name);
	if(l.isEmpty()) {
		throw new EmployeeNameNotFoundException();
	} else {
		return l;
	}
}
public List<Employee> getSalary(int salary)throws EmployeeSalaryNotFoundException {
	List<Employee> l=empDao.getSalary(salary);
	if(l.isEmpty()) {
		throw new EmployeeSalaryNotFoundException();
	}
	else {
		return l;
	}
}
public List<Employee> getPhNo(long phNo)throws EmployeePhNoNotFoundException {
	List<Employee> l=empDao.getPhNo(phNo);
	if(l.isEmpty()) {
		throw new EmployeePhNoNotFoundException();
	}
	else {
		return l;
	}
}
public List<Employee> findlist() {
	return empDao.findlist();
}
public String deleteId(int id) {
	return empDao.deleteId(id);
}
public String update(Employee id) {
	return empDao.update(id);
}


public String patch(int id, String name) {
	return empDao.patch(id,name);
}

}