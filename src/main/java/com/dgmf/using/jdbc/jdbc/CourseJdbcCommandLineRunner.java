package com.dgmf.using.jdbc.jdbc;

import com.dgmf.using.jdbc.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        // courseJdbcRepository.insert();
        // Insert Data
        courseJdbcRepository.insert(new Course(
                1L, "Learn Spring Boot", "John Doe"
                )
        );
        courseJdbcRepository.insert(new Course(
                2L, "Learn Spring JDBC", "John Doe"
                )
        );
        courseJdbcRepository.insert(new Course(
                3L, "Learn Spring MVC", "John Doe"
                )
        );
        courseJdbcRepository.insert(new Course(
                4L, "Learn Spring CLOUD", "John Doe"
                )
        );

        // Delete Data
        courseJdbcRepository.deleteById(4L);

        // Select Data
        System.out.println(courseJdbcRepository.findById(1L));
        System.out.println(courseJdbcRepository.findById(2L));
        System.out.println(courseJdbcRepository.findById(3L));
    }
}
