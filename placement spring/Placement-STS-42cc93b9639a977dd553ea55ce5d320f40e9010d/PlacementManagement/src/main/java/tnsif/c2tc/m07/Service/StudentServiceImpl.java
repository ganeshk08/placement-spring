package tnsif.c2tc.m07.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.Entity.Student;
import tnsif.c2tc.m07.Repository.StudentRepo;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired 
    StudentRepo sr;
    
//	@Override
//	public void addStudent1(Student student) {
//		sr.save(student);
//	
//	}

	@Override
	public Student updateStudent(Student student) {
		
		return null;
	}

//	@Override
//	public Student getStudentById1(long id) {
//		Student s = sr.findById(id).get();
//		return s;
//		
//	}

	@Override
	public Student searchStudentByHallTicket(long id) {
	
		return null;
	}

	@Override
	public boolean deleteStudent(long id) {
	return true ;
	}

	@Override
	public void addCertificate(String certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCertificate(String certificate) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Object addStudent(Student student) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Student getStudent(Long id) {
		Student s=sr.findById(id).get();
		return s;
	}

//	@Override
//	public void addstudent(Student student) 
//	{
//		
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Student searchStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
		
	}
}
