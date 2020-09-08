package com.ws.mysqltest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class MysqltestApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(11111111);
        System.out.println(dataSource.getClass());
        System.out.println(22222222);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println(3333333);
            System.out.println(connection);
            System.out.println(444444444);
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
