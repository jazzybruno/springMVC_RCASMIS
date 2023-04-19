/**
 * 
 */
package rw.ac.rca.webapp.dao;

import java.util.List;

import rw.ac.rca.webapp.orm.AcademicYear;

/**
 * @author Aphrodice Rwagaju
 *
 */
public interface AcademicYearDAO {
	
	public AcademicYear saveAcademicYear(AcademicYear academicYear);
	public AcademicYear updateAcademicYear(AcademicYear academicYear);
	public AcademicYear saveOrUpdateAcademicYear(AcademicYear academicYear);
	public boolean deleteAcademicYear(AcademicYear academicYear);
	public AcademicYear getAcademicYearById(int id);
	public List<AcademicYear> getAllAcademicYears();
}
