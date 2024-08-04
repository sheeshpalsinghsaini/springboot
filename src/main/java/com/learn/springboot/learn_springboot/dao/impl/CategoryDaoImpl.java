package com.learn.springboot.learn_springboot.dao.impl;
import com.learn.springboot.learn_springboot.dao.CategoryDao;
import com.learn.springboot.learn_springboot.model.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    private static final Logger log = LoggerFactory.getLogger(CategoryDaoImpl.class);
    private final JdbcTemplate jdbcTemplate;

    public CategoryDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        String createQuery = "CREATE TABLE IF NOT EXISTS category(id int primary key, title varchar(200) not null, description varchar(500) not null)";
        jdbcTemplate.update(createQuery);
        System.out.println("Category table is created or exists");
    }

    @Override
    public Category create(Category category) {

        int update = jdbcTemplate.update("insert into category(id, title, description) values(?,?,?)", category.getId(), category.getTitle(), category.getDescription());
        log.info("Row affected : {}",update);
        return category;
    }
}
