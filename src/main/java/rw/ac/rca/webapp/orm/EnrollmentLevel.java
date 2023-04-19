/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "enrollment_level")
public class EnrollmentLevel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private String name;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "enrollmentLevel")
	private List<Enrol> enrols;
	
	public EnrollmentLevel(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public List<Enrol> getEnrols() {
		return enrols;
	}
	public void setEnrols(List<Enrol> enrols) {
		this.enrols = enrols;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
