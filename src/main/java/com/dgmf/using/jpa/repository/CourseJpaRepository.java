package com.dgmf.using.jpa.repository;

import com.dgmf.using.jpa.entity.CourseJpa;
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
    public void insert(CourseJpa course) {
        entityManager.merge(course);
    }

    // Retrieved Data using Spring Data JPA
    public CourseJpa findById(Long id) {
        CourseJpa course = entityManager.find(CourseJpa.class, id);

        return course;
    }

    // Deleted Data using Spring Data JPA
    public void deleteById(Long id) {
        // Find Entity
        CourseJpa course = entityManager.find(CourseJpa.class, id);

        // Delete Entity
        entityManager.remove(course);
    }
}
