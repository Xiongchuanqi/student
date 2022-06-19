package com.example.student;

import com.example.student.bean.Student;
import com.example.student.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class StudentApplicationTests {

//    @Autowired
//    DataSource dataSource;

    @Autowired

    StudentMapper studentMapper;
    @Test
    void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//        System.out.println(dataSource.getClass());
//        connection.close();

        List<Student> students = studentMapper.queryStudentList();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
