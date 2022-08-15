package admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "admindb")                          ////used to identify a domain object, which is persisted to MongoDB
public class Admin {
	@Id
	 int id;
	 private String name;
	 private String password;
	 
	 
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Admin() {
		
	}
	public Admin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password =password;
	}
	@Override                                                       //used for helping to check whether the developer what to override the correct method in the parent class or interface
	public String toString() {                                       // used to return a string representation of an object. 
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	

}
