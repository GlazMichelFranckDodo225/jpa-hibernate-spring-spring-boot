package com.dgmf.using.spring.data.jpa.hibernate.repository;

import com.dgmf.using.spring.data.jpa.hibernate.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
// import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

// Using JPA
@Repository
@Transactional // To execute Queries with JPA
public class CourseJpaRepository {
    @PersistenceContext // @Autowired can be used also
    private EntityManager entityManager;

    // Inserting Data using Spring Data JPA
    public void insert(Course course) {
        entityManager.merge(course);
    }

    // Retrieved Data using Spring Data JPA
    public Course findById(Long id) {
        Course course = entityManager.find(Course.class, id);

        return course;
    }

    // Deleted Data using Spring Data JPA
    public void deleteById(Long id) {
        // Find Entity
        Course course = entityManager.find(Course.class, id);

        // Delete Entity
        entityManager.remove(course);
    }
}
