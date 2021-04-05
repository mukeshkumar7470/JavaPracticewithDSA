package com.mukesh.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class StudentIterator {
    private int studentId;
    private String studentName;
    private boolean courseRegistered;

    public StudentIterator(int studentId, String studentName, boolean courseRegistered) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseRegistered = courseRegistered;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(boolean courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

}




public class iteratorMethodTryout {
    public static void main(String[] args) {
        List<StudentIterator> students = new ArrayList<StudentIterator>();
        students.add(new StudentIterator(1001, "Steve", true));
        students.add(new StudentIterator(1002, "Rachel", false));
        students.add(new StudentIterator(1003, "Monica", true));
        students.add(new StudentIterator(1004, "David", true));

        ListIterator<StudentIterator> item = students.listIterator();
        System.out.println("StudentIterator names");
        while (item.hasNext()) {
            System.out.println(item.next().getStudentName());
        }

        System.out.println();

        System.out.println("StudentIterator names in reverse order");
        while (item.hasPrevious()) {
            System.out.println(item.previous().getStudentName());
        }

    }
}
