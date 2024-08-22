package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    public void testFindStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405930", "Benyapa");
        studentList.addNewStudent("6610401240", "Bobby");
        studentList.addNewStudent("6610405290", "Billy");

        Student student = studentList.findStudentById("6610405930");

        String expected = "6610405930";
        String actual = student.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405930", "Benyapa");
        studentList.addNewStudent("6610401240", "Bobby");
        studentList.addNewStudent("6610405290", "Billy");


    }


}