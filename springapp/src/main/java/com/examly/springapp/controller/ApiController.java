package com.examly.springapp.controllers;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    CustomerRepo custRepo;
	@GetMapping("/test")
	public String showMsg() {

		return "Welcome ";
	}

    @GetMapping("/{id}")
	public Optional<Customer> getEmpDetails(@PathVariable(value = "id") int custId) {

		System.out.println("inside controller " + custId);
		Optional<Customer> customer = custRepo.findById(custId);
		if (customer != null) {
			return customer;
		} else {
			return null;
		}
	}
	
	
    
}