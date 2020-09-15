package com.example.webshop.repository;

import com.example.webshop.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class DBFoodRepository implements IProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public List<Food> readAll() {

        List<Food> food = new ArrayList<>();

            String sql = "Select * From product";
            sqlRowSet = jdbcTemplate.queryForRowSet(sql);

            while (sqlRowSet.next()) {
                food.add(new Food(sqlRowSet.getInt("id"), sqlRowSet.getString("name"), sqlRowSet.getInt("price")));

            }
            return food;
    }
}

