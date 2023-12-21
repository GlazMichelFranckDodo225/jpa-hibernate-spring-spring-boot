package com.dgmf.using.spring.data.jpa.hibernate.cmdlinerunner;

import com.dgmf.using.spring.data.jpa.hibernate.entity.Course;
import com.dgmf.using.spring.data.jpa.hibernate.repository.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseSpringDataJpaCLR implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJpaRepository springDataJpaRepository;


    @Override
    public void run(String... args) throws Exception {
        // Insert Data
        springDataJpaRepository.save(new Course(
                        1L, "Learn Spring JPA", "John Doe"
                )
        );
        springDataJpaRepository.save(new Course(
                        2L, "Learn Spring JPA", "John Doe"
                )
        );
        springDataJpaRepository.save(new Course(
                        3L, "Learn Spring JPA", "John Doe"
                )
        );
        springDataJpaRepository.save(new Course(
                        4L, "Learn Spring JPA", "John Doe"
                )
        );

        // Delete Data
        springDataJpaRepository.deleteById(4L);

        // Select Data
        System.out.println(springDataJpaRepository.findById(1L));
        System.out.println(springDataJpaRepository.findById(2L));
        System.out.println(springDataJpaRepository.findById(3L));
    }
}
