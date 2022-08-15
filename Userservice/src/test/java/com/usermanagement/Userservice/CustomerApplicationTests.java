//package com.usermanagement.Userservice;
//
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.Set;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.customer.CustomerApplication;
//import com.customer.mapper.SignupMapper;
//import com.customer.model.Login;
//import com.customer.model.Signup;
//import com.customer.repository.Userrepo;
//
//@SpringBootTest(classes= {CustomerApplication.class})
//public class CustomerApplicationTests {
//	
//	@Autowired
//	private Validator validator;
//	
//	  @Autowired
//	  Userrepo repo;
//	  
//	  @Autowired
//	  SignupMapper mapper;
//	  
//	  
//	  
//	  @Before
//		public void setUp() {
//			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//			validator = factory.getValidator();
//		} 
//	  
//	  
//	   @Test
//	   @Order(1)
//	   public void addTest() {
//		   
//		    Signup signup = new Signup();
//		    signup.setId((long) 101);
//		    signup.setName("Sakshi");
//		    signup.setUsername("sakshu");
//		    signup.setPassword("Sakshi27");
//		    signup.setConfirmpassword("Sakshi27");
//		    signup.setContactno("9528133463");
//		    signup.setEmail("panwarsakshi28@gmail.com");
//			Login login = new Login(null, null);
//		    
//		    BeanUtils.copyProperties(signup, signup);
//		    repo.save( mapper.mapDtoToEntity(signup));
//		    assertNotNull(repo.findById(101));
//		    
//	   
//	   }
//	   
//	  @Test
//	  public void addTest2() {
//		    Signup signup = new Signup();
//
//		    signup.setId((long) 102);
//		    signup.setName("nirali");
//		    signup.setUsername("niral");
//		    signup.setPassword("nirali27");
//		    signup.setConfirmpassword("nirali27");
//		    signup.setContactno("5978528458");
//		    signup.setEmail("nirali54@gmail.com");
//		    BeanUtils.copyProperties(signup, signup);
//		    repo.save( mapper.mapDtoToEntity(signup));
//		    Set<ConstraintViolation<Signup>> violations = validator.validate(signup);
//			assertTrue(violations.isEmpty());
//		  
//	  }
////	   @Test
////	   public void addTest3() {
////		    Signup signup = new Signup();
////
////		    signup.setId((long) 103);
////		    signup.setName("niral");
////		    signup.setUsername("niral");
////		    signup.setPassword("nirali27");
////		    signup.setConfirmpassword("nirali27");
////		    signup.setContactno("9998458");
////		    signup.setEmail("nirali54@gmail.com");
////		    BeanUtils.copyProperties(signup, signup);
////		    repo.save( mapper.mapDtoToEntity(signup));
////		    Set<ConstraintViolation<Signup>> violations = validator.validate(signup);
////			assertFalse(violations.isEmpty());
////	   }
//	   
//	   
//
//   
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//			  