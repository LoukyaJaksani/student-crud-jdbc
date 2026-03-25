package com.loukys.student;

import com.loukys.student.StudentDao.StudentDao;
import com.loukys.student.model.Student;

public class Main {
    public static void main(String[] args) {
        try {

            StudentDao dao = new StudentDao();
            dao.addStudent(new Student(0, "Hari", 75));
            dao.getStudent();
            dao.updateStudent(2, "Shravi");
            dao.deleteStudent(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}