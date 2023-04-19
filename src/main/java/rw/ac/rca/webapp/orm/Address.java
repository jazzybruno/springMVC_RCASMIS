/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
   
/**
 * @author Aphrodice Rwagaju
 *
 */
@Entity
@Table(name = "address")
public class Address implements Serializable{
	/**
	 * 
	 */             
	private static final long serialVersionUID = 1L;
	@Id       
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String country;
	private String city;
	private String streetAddress;
	private String postalCode;
	
	 @OneToMany(cascade= CascadeType.ALL, mappedBy = "address")
	private Set<Student> students;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "address")
	private Set<Instructor> instructors;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Set<Instructor> getInstructors() {
		return instructors;
	}
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}
	public Address() {
	}
	
	public Address(String country, String city, String streetAddress, String postalCode) {
		this.country = country;
		this.city = city;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
	}
	
}
