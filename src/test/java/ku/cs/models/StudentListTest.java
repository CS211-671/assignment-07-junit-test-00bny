package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testFindStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405930", "Benyapa");
        studentList.addNewStudent("6610401240", "Bobby");
        studentList.addNewStudent("6610405290", "Billy");

        studentList.findStudentById("6610405930");



    }

}