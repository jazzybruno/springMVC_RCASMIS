/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author Aphrodice Rwagaju
 *
 */
@Entity
//@DiscriminatorValue("Instuctor")
public class Instructor extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6073878228230771199L;
	private double salary;
	private Date remunerationDate;
	
	@ManyToMany(cascade= CascadeType.ALL, mappedBy = "instructors")
	private Set<Course> courses;
	
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	public Date getRemunerationDate() {
		return remunerationDate;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public void setRemunerationDate(Date remunerationDate) {
		this.remunerationDate = remunerationDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Instructor() {
	}
	
	public Instructor(double salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//To add course to an instructor helper method
	public void addCourse(Course course) {
        this.courses.add(course);
        //if(course.getInstructors()!=null)
        course.getInstructors().add(this);
    }
	//To remove course to an instructor helper method
    public void removeCourse(Course course) {
        this.courses.remove(course);
        course.getInstructors().remove(this);
    }
    
//	@Override
//	String getAllNames() {
//		return getFirstName()+ " "+ getLastName();
//	}
}
