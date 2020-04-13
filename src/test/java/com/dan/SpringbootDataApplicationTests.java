package com.dan;

import com.dan.mult.DynamicDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class SpringbootDataApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception{
        System.out.println(dataSource.getClass());
        DynamicDataSource dynamicDataSource= (DynamicDataSource) dataSource;
        System.out.println(dynamicDataSource);
    }

}
