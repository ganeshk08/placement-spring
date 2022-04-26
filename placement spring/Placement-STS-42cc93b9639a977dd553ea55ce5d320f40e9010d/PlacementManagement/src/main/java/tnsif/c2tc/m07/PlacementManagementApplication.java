package tnsif.c2tc.m07;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import tnsif.c2tc.m07.Repository.StudentRepo;

@SpringBootApplication
@ComponentScan(basePackages = "tnsif.c2tc.m07.*")
@EnableJpaRepositories("tnsif.c2tc.m07.Repository")
public class PlacementManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(PlacementManagementApplication.class, args);
		StudentRepo student = context.getBean(StudentRepo.class);
	}

}
