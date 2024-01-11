/*package com.dgmf.using.jpa.cmdlinerunner;

import com.dgmf.using.jpa.repository.CourseJpaRepository;
import com.dgmf.using.jpa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;*/

/*@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Insert Data
        courseJpaRepository.insert(new Course(
                1L, "Learn Spring JPA", "John Doe"
                )
        );
        courseJpaRepository.insert(new Course(
                2L, "Learn Spring JPA", "John Doe"
                )
        );
        courseJpaRepository.insert(new Course(
                3L, "Learn Spring JPA", "John Doe"
                )
        );
        courseJpaRepository.insert(new Course(
                4L, "Learn Spring JPA", "John Doe"
                )
        );

        // Delete Data
        courseJpaRepository.deleteById(4L);

        // Select Data
        System.out.println(courseJpaRepository.findById(1L));
        System.out.println(courseJpaRepository.findById(2L));
        System.out.println(courseJpaRepository.findById(3L));
    }
}*/
