package tnsif.c2tc.m07.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.Entity.Student;
import tnsif.c2tc.m07.Service.StudentService;

@RestController
@RequestMapping("/CRUDapi")
@CrossOrigin(value = "http://localhost:8383")
public class StudentController {
	@Autowired
	StudentService service;

//	@PostMapping("/addStudent")
//	public Object addStudent(@RequestBody Student student) {
//		return service.addStudent(student);
//
//	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student stdData)
	{
		return new ResponseEntity<Student>(service.addStudent(stdData), HttpStatus.CREATED);
	}

//	@GetMapping("/getStudent/{id}")
//	public Student getStudent(@PathVariable("id") Long id) {
//		return service.getStudent(id);
//
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent1(@PathVariable("id") Long id)
	{
		System.out.println(id);
		return new ResponseEntity<Student>(service.getStudent(id), HttpStatus.OK);
	}

	@GetMapping("/getStudent/{TicketNo}")
	public Student searchStudentByHallTicket(@PathVariable long id) {
		return service.searchStudentByHallTicket(id);
	}

	@PutMapping("/putStudent")
	public void updateStudent(@RequestBody Student s) {
		service.updateStudent(s);
	}

	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestBody long id) {
		service.deleteStudent(id);
	}

}
