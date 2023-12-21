package com.dgmf.using.spring.data.jpa.hibernate.repository;

import com.dgmf.using.spring.data.jpa.hibernate.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends
        JpaRepository<Course, Long> {
}
