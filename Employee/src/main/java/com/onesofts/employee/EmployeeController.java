package com.onesofts.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
@Autowired
EmployeeService empSer;
@PostMapping(value="/add")
public String addEmp(@RequestBody Employee e) {
	return empSer.addEmp(e);
}


@PostMapping(value="/Emp")
public String addEmps(@RequestBody List<Employee> emps) {
	return empSer.addEmps(emps);
}

@GetMapping(value="/update/{id}")
public Employee findId(@PathVariable int id)throws EmployeeNotFoundException {
         return empSer.findId(id);
}
@GetMapping(value="/getage/{age}")
public List<Employee> getAge(@PathVariable int age)throws EmployeeAgeNotFoundException {
	return empSer.getAge(age);
}
@GetMapping(value="/getname/{name}")
public List<Employee> getName(@PathVariable String name)throws EmployeeNameNotFoundException {
	return empSer.getName(name);
}
@GetMapping(value="/getsalary/{salary}")
public List<Employee> getSalary(@PathVariable int salary)throws EmployeeSalaryNotFoundException {
	return empSer.getSalary(salary);
}
@GetMapping(value="/getphNo/{phNo}")
public List<Employee> getPhNo(@PathVariable long phNo)throws EmployeePhNoNotFoundException {
	return empSer.getPhNo(phNo);
}
//@PutMapping(value="/updatevalue/{id}")
//public List<Employee> updatevalue(@PathVariable int id)throws EmployeeUpdateDetailNotFoundException {
//	return empSer.updatevalue(id);
//}
@PostMapping(value="/view")
public List<Employee> findlist(){
	return empSer.findlist();
}

@DeleteMapping(value="/delete/{id}")
public String deleteId(@PathVariable int id) {
	return empSer.deleteId(id);
}
@PutMapping(value="/update/{id}")
public String update(@RequestBody Employee id) {
	return empSer.update(id);
}
@PatchMapping("/users/{id}")
public String patch(@PathVariable int id,@RequestBody String name) {
	return empSer.patch(id,name);
}
}