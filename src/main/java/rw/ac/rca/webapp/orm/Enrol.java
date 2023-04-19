/**
 * 
 */
package rw.ac.rca.webapp.orm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Aphrodice Rwagaju
 *
 */
@Entity
@Table(name = "enrollment")
public class Enrol implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date enrollmentDate;
	private double grade;
	@ManyToOne
	@JoinColumn(name = "semester_id")
	private Semester semester;
	
	@ManyToOne
	@JoinColumn(name = "enrollment_level_id")
	private EnrollmentLevel enrollmentLevel;
	
	@ManyToOne
	@JoinColumn(name = "academic_year_id")
	private AcademicYear academicYear;
	
	public AcademicYear getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}
	public EnrollmentLevel getEnrollmentLevel() {
		return enrollmentLevel;
	}
	public void setEnrollmentLevel(EnrollmentLevel enrollmentLevel) {
		this.enrollmentLevel = enrollmentLevel;
	}
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student getStudent() {
		return student;
	}  
	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	public Enrol() {
		
	}
	public Enrol(Date enrollmentDate, double grade, Student student, Course course, Semester semester, EnrollmentLevel level, AcademicYear academicYear) {
		this.enrollmentDate = enrollmentDate;
		this.grade = grade;
		this.student = student;
		this.course = course;
		this.semester = semester;
		this.enrollmentLevel = level;
		this.academicYear = academicYear;
	}
	
}