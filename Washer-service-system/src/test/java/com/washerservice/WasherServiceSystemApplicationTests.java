package com.washerservice;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.washer.Repository.WasherRepo;
import com.washer.model.Washers;
import com.washer.washermapper.WasherMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class WasherServiceSystemApplicationTests {
	
	@Autowired
	private Validator validator;
	
	@Autowired
	WasherMapper mapper;
	
	@Autowired
	WasherRepo repo;
	
	@Before
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	@Order(1)
	public void testAdd() {
		Washers washers = new Washers();
		washers.setId(101);
		washers.setName("sonu");
		washers.setLocation("Gzb");
		washers.setPassword("12345");
		repo.save(washers);
		assertNotNull(repo.findById(101));
		washers.setId(102);
		washers.setName("sonu");
		washers.setLocation("Gzb");
		washers.setPassword("12345");
		repo.save(washers);
		assertNotNull(repo.findById(102));
	}
		
		//if any entity is filled with wrong data
		@Test
		public void testAdd2() {
			Washers washers = new Washers();
			washers.setId(103);
			washers.setPassword("12345");
			washers.setLocation("Gzb");
			repo.save(mapper.mapDToEntity(washers));
			assertNull(repo.findById(103));
		     
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	