package com.dgmf.using.spring.data.jpa.repository;

import com.dgmf.using.spring.data.jpa.entity.CourseSpringDataJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends
        JpaRepository<CourseSpringDataJpa, Long> {
    List<CourseSpringDataJpa> findByAuthor(String author);
    CourseSpringDataJpa findByName(String name);
}
