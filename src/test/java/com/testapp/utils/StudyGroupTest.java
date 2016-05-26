package com.testapp.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.testapp.utils.Student;
import com.testapp.utils.StudyGroup;

    
public class StudyGroupTest {
    @Test
    public void testStudyGroupClass() {
        // prepare the data for test
        final List<Student> testStudents = new ArrayList<Student>();
        testStudents.add(new Student(1, "Student No.1", 6));
        testStudents.add(new Student(2, "Student No.2", 70));
        testStudents.add(new Student(3, "Student No.2", 80));
        
        // Start the unit test
        final StudyGroup testGroup = new StudyGroup();
        for(Student student: testStudents) {
            testGroup.addStudent(student);
        }
        Assert.assertEquals(testGroup.getGroupSize(), testStudents.size());
        
        Student testStudent = testStudents.get(0);
        Student returnedStudent = testGroup.getStudent(testStudent.getId());
        Assert.assertSame(returnedStudent, testStudent);
        Assert.assertEquals(returnedStudent.getId(), 5);
        Assert.assertEquals(returnedStudent.getName(), testStudent.getName());
        Assert.assertEquals(returnedStudent.getScore(), testStudent.getScore());
        
        testGroup.removeStudent(testStudent.getId());
        Assert.assertEquals(testGroup.getGroupSize(), testStudents.size() - 1);
        
        testGroup.clear();
        Assert.assertEquals(testGroup.getGroupSize(), 0);
    }
}