/**
 * 
 */
package rw.ac.rca.webapp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import rw.ac.rca.webapp.dao.CourseDAO;
import rw.ac.rca.webapp.orm.Course;

/**
 * @author Aphrodice Rwagaju
 *
 */
public class CourseDAOImpl extends DAO implements CourseDAO {

	private static CourseDAOImpl instance;

	private CourseDAOImpl() {
	}

	public static CourseDAOImpl getInstance() {
		if (instance == null) {
			return new CourseDAOImpl();
		} else {
			return instance;
		}
	}
	
	public Course saveCourse(Course course) {
		try {
			begin();
			getSession().save(course);
			commit();
			return course;
		} catch (Exception e) {
			rollback();
			return null;
		}
	}

	public Course updateCourse(Course course) {
		try {
			begin();
			getSession().update(course);
			commit();
			return course;
		} catch (Exception e) {
			rollback();
			return null;
		}
	}

	public Course saveOrUpdateCourse(Course course) {
		try {
			begin();
			getSession().saveOrUpdate(course);
			commit();
			return course;
		} catch (Exception e) {
			rollback();
			return null;
		}
	}

	public boolean deleteCourse(Course course) {
		try {
			begin();
			Query query = getSession().createQuery(
					"from Course where id= :ref");
			query.setInteger("ref", course.getId());
			Course crs = (Course) query.uniqueResult();
			getSession().delete(crs);
			commit();
			return true;

		} catch (Exception e) {
			rollback();
			return false;
		}
	}

	public Course getCourseById(int courseId) {
		try {
			begin();
			Query query = getSession().createQuery(
					"from Course where id= :ref");
			query.setInteger("ref", courseId);
			Course course = (Course) query.uniqueResult();
			commit();
			return course;
		} catch (Exception e) {
			rollback();
			return null;

		}
	}

	@SuppressWarnings("unchecked")
	public List<Course> getAllCourses() {
		try {
			begin();
			Query query = getSession().createQuery("from Course");
			List<Course> courses = query.list();
			commit();
			return courses;
		} catch (Exception e) {
			rollback();
			return null;
		}
	}
}