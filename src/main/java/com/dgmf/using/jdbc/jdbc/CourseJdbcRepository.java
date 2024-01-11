package com.dgmf.using.jdbc.jdbc;

import com.dgmf.using.jdbc.entity.CourseJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    // Inserting Hardcoded Data using Spring JDBC
    /*private String INSERT_QUERY =
            """
                INSERT INTO course (id, name, author)
                values (1, 'Learn AWS', 'Glaz Dodo');
            """;*/

    // Inserting Data using Spring JDBC
    private String INSERT_QUERY =
            """
                INSERT INTO course (id, name, author)
                values (?, ?, ?);
            """;

    // Deleting Data using Spring JDBC
    private String DELETE_QUERY =
            """
                DELETE FROM course WHERE id = ?;
            """;

    // Selecting Data using Spring JDBC
    private String SELECT_QUERY =
            """
                SELECT * FROM course WHERE id = ?;
            """;

    /*public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }*/

    public void insert(CourseJdbc course) {
        springJdbcTemplate.update(
                INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor()
        );
    }

    public void deleteById(Long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public CourseJdbc findById(Long id) {
        CourseJdbc course = springJdbcTemplate.queryForObject(
                SELECT_QUERY,
                new BeanPropertyRowMapper<>(CourseJdbc.class),
                id
        );

        return course;
    }
}
