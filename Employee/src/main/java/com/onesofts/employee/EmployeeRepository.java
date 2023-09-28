package com.onesofts.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




    public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {
	    @Query(value="Select * from employee where age=?",nativeQuery=true)
	    public List<Employee> getAge(int age);
	
	
		@Query(value="Select * from employee where name=?",nativeQuery=true)
		public List<Employee> getName(String name);
		
		@Query(value="Select * from employee where salary=?",nativeQuery=true)
		public List<Employee> getSalary(int salary);
	
		@Query(value="Select * from employee where phone_no=?",nativeQuery=true)
	    public List<Employee> getPhNo(long phNo);
}
