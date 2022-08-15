package admin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import admin.model.Admin;
import admin.model.Bookingdetails;
import admin.model.CustomerRating;
//import admin.model.JwtRequest;
//import admin.model.JwtResponse;
import admin.model.Washers;
import admin.model.washpack;
import admin.service.serviceImplementation;
@CrossOrigin(origins="http://localhost:3000")
@RestController                                             //allows the class to handle the requests made by the client
@RequestMapping("/admin")
public class Admincontroller {
	
	Logger logger= org.slf4j.LoggerFactory.getLogger(Admincontroller.class);
	
	@Autowired
	private serviceImplementation service;

	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {                //used to enable communication between different microservices
		return new RestTemplate();                      
		
	}
	// Admin operations
	@PostMapping("/addadmin")
	public String saveadmin(@RequestBody Admin admin) {
		service.saveadmin(admin);
		
		return "Admin saved by ID:" + admin.getId();
	}

	@GetMapping("/alladmin")
	public List<Admin> getadmin() {
		return service.findAll();
	}

	@PutMapping("/updateadmin")
	public String updateadmin(@RequestBody Admin admin) {
		service.saveadmin(admin);
		return "Admin updated successfully with Id:" + admin.getId();
	}

	@DeleteMapping("/deleteadmin")
	public String deleteadmin(@RequestParam int id) {
		service.deleteadmin(id);
		return "Sucessfully deleted admin";
	}

	// packs operations
	@GetMapping("/allpacks")
	public List<washpack> getwashpacks() {
		return service.getwashpack();

	}

	@PostMapping("/addpack")
	public String savepack(@RequestBody washpack p) {
		service.savepack(p);
		return "New pack added";
	}
	
	@PutMapping("/updatepack")
	public String savepacku(@RequestBody washpack p) {
		service.savepack(p);
		return "New pack added";
	}
	
	

	@DeleteMapping("/deletepack/{id}")
	public String deletepack(@RequestParam int id) {
		service.deletepack(id);
		return "pack deleted";
	}
	
	// Ratings operations
	@PostMapping("/addratings")
	public String saveratings(@RequestBody CustomerRating rating) {
		service.save(rating);
		return "Thanks for your feedback";
	}

	@GetMapping("/allratings")
	public List<CustomerRating> getuser() {
		// TODO Auto-generated method stub
		return service.getuser();
	}

	//RestTemplates
	
	// bookings
	@GetMapping("/allorders")
	public List<Bookingdetails> getorder() {
		String baseurl = "http://localhost:8083/order/allorders";
		Bookingdetails[] allorders = restTemplate.getForObject(baseurl, Bookingdetails[].class);
		return Arrays.asList(allorders);
	}

	// washers
	@GetMapping("/allwashers")
	public List<Washers> findAllwashers() {
		String baseurl = "http://localhost:8082/wash/allwashers";
		Washers[] wash = restTemplate.getForObject(baseurl, Washers[].class);
		return Arrays.asList(wash);
	}

}
