package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.AddressEntity;
import com.Entity.EmployeeEntity;
import com.Repository.AddressRepository;
import com.Repository.EmployeeRepository;

@Controller
public class OneToOneController {

	@Autowired
	EmployeeRepository emplRepo;

	@Autowired
	AddressRepository addRepo;

	@GetMapping("/newEmp")
	public String addEmployee() {
//		emplRepo.save(employee);
		return "NewEmployee";
	}

	// saving employee
	@PostMapping("/saveemp")
	public String addemployee(EmployeeEntity employee) {
		emplRepo.save(employee);
		return "NewEmployee";
	}
	
	
	
	// saving address
	@PostMapping("/saveaddress")
	public String saveAddress(AddressEntity addEntity) {
		addRepo.save(addEntity);
		return "Login";
	}

	@GetMapping("/loginEmp")
	public String login() {
		return "Login";
	}

	@PostMapping("/loginemp")
	public String loginEmpAuthenticate(EmployeeEntity employeeEntity) {
		
		emplRepo.findByName(employeeEntity.getName());
		
		System.out.println(employeeEntity.getName());
		
		if(employeeEntity ==  null) {
			return "Login";
		}else
		{
			return "Home";
		}
	}
}
