package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.models.Category;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryDaoTest extends BaseDaoTestClass {
    // add Category Unit Tests

    private MySqlCategoryDao dao;

    // injecting
    @BeforeEach
    public void setup() {
        dao = new MySqlCategoryDao(dataSource);
    }

    @Test
    public void getById_shouldReturn_RightCategory(){
        // arrange
        int category_id = 1;
        Category expected = new Category()
        {{
            setCategoryId(1);
            setName("Electronics");
            setDescription("Explore the latest gadgets and electronic devices.");

        }};

        // act
        var actual = dao.getById(category_id);

        //assert
        assertEquals(expected.getName(), actual.getName(), "Because I tried to get the first category from the database.");

    }






}