package service;

import java.util.List;
import model.Student;

public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

}
