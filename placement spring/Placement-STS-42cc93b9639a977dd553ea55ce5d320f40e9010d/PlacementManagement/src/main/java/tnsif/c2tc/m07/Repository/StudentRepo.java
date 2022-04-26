package tnsif.c2tc.m07.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tnsif.c2tc.m07.Entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long>
{
	
}
