package com.dgmf;

import com.dgmf.using.spring.data.jpa.entity.CourseSpringDataJpa;
import com.dgmf.using.spring.data.jpa.repository.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	CourseSpringDataJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// Insert Data
		repository.save(new CourseSpringDataJpa(1L, "Learn Spring JPA", "John Doe"));
		repository.save(new CourseSpringDataJpa(2L, "Learn AWS", "Nolan Portal"));
		repository.save(new CourseSpringDataJpa(3L, "Learn Spring Boot", "Lewit Carol"));
		repository.save(new CourseSpringDataJpa(4L, "Learn Docker", "Mimi Matty"));

		// Select Data
		System.out.println(repository.findById(1L));
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Mimi Matty"));
		System.out.println(repository.findByAuthor("Lewit Carol"));
		System.out.println(repository.findByName("Learn AWS"));

		// Delete Data
		repository.deleteById(4L);
	}
}


