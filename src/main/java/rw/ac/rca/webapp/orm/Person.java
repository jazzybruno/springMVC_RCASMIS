/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Aphrodice Rwagaju
 *
 */
@MappedSuperclass
public abstract class Person implements Serializable{
	
	private static final long serialVersionUID = 2173199134252447177L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String phoneNumber;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//@Column(nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Person() {
	}

	public Person(String firstName, String lastName, Date dateOfBirth, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

}
