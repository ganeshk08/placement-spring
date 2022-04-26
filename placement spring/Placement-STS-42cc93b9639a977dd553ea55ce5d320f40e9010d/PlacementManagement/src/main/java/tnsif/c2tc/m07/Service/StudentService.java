package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.Entity.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);

	public Student searchStudentByHallTicket(long id);
	public void addCertificate(String certificate);
	public void updateCertificate(String certificate);
	public boolean deleteStudent(long id);
	public Student getStudent(Long id);
//	void addstudent(Student student);
//	void addStudent1(Student student);
//	Student getStudentById1(long id);
	
}
