/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "semester")
public class Semester  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String code;
	private String name;
	private Date startDate;
	private Date endDate;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "semester")
	private List<Enrol> enrols;
	
	public Semester() {
	}
	
	public Semester(String code, String name, Date startDate, Date endDate) {
		this.code = code;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Enrol> getEnrols() {
		return enrols;
	}
	public void setEnrollments(List<Enrol> enrols) {
		this.enrols = enrols;
	}
}