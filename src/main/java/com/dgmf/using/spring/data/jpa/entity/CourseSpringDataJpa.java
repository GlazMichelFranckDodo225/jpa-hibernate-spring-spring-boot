package com.dgmf.using.spring.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class CourseSpringDataJpa {
    @Id
    private Long id;
    private String name;
    private String author;
}
