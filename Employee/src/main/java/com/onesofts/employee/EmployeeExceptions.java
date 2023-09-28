package com.onesofts.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptions {
	@ExceptionHandler(EmployeeNotFoundException.class) 
	public ResponseEntity<Object> idNotFoundException() {
		return new ResponseEntity<>("There is No Id Data in This Employee List",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmployeeAgeNotFoundException.class) 
	public ResponseEntity<Object> ageNotFoundException() {
		return new ResponseEntity<>("There is No Age Data in This Employee List",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeNameNotFoundException.class) 
	public ResponseEntity<Object> nameNotFoundException() {
		return new ResponseEntity<>("There is No Name Data in This Employee List",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeSalaryNotFoundException.class)
	public ResponseEntity<Object> salaryNotFoundException() {
		return new ResponseEntity<>("There is No Salary Data in This Employee List",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeePhNoNotFoundException.class)
	public ResponseEntity<Object> phNoNotFoundException() {
		return new ResponseEntity<>("There is No PhoneNumber Data in This Employee List",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeUpdateDetailNotFoundException.class)
	public ResponseEntity<Object> updateDetailNotFoundException() {
		return new ResponseEntity<>("There is no List Data in This Employee List",HttpStatus.NOT_FOUND);
	}
}
