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
        studentList.addNewStudent("6610405930", "Benyapa", 100);
        studentList.addNewStudent("6610401240", "Bobby", 50);
        studentList.addNewStudent("6610405290", "Billy", 70);

        studentList.giveScoreToId("6610405930", 100);

        Student student = studentList.findStudentById("6610405930");
        assertEquals(200, student.getScore());
    }

    @Test
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405930", "Benyapa", 100);
        studentList.addNewStudent("6610401240", "Bobby", 50);
        studentList.addNewStudent("6610405290", "Billy", 70);

        String grade = studentList.viewGradeOfId("6610405930");

        assertEquals("A", grade);
    }

}