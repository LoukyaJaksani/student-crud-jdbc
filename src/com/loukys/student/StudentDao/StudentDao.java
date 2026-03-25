package com.loukys.student.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

import com.loukys.student.model.Student;
import com.loukys.student.util.DBConnection;

public class StudentDao {

    public void addStudent(Student s) throws Exception {

        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO STUDENTS (name,marks)VALUES(?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setInt(2, s.getMarks());
        ps.executeUpdate();
        System.out.println(" Values Updated");
        conn.close();

    }

    public void getStudent() throws Exception {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");

        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " +
                            rs.getString(2) + " " +
                            rs.getInt(3));
        }

        conn.close();
    }

    public void updateStudent(int id, String name) throws Exception {
        Connection conn = DBConnection.getConnection();
        String query = "Update students set name =? where id =?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();
        conn.close();

    }

    public void deleteStudent(int id) throws Exception {
        Connection conn = DBConnection.getConnection();
        String query = "DELETE FROM students where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();

    }
}
