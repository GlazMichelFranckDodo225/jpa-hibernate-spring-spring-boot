package com.dgmf.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private String INSERT_QUERY =
            """
                INSERT INTO course (id, name, author)
                values (1, 'Learn AWS', 'Glaz Dodo');
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
