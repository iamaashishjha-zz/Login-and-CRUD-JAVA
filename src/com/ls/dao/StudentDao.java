
package com.ls.dao;

import com.ls.bll.Student;
import java.io.IOException;
import java.util.ArrayList;


public interface StudentDao {
    void saveStudent(Student s) throws IOException;
    void updateStudent(Student s) throws IOException;
    void listStudent(int SID) throws IOException;
    void deleteStudent(int SID) throws IOException;
    ArrayList<String>getAlLStudents() throws IOException;
    boolean checkSid(Student s) throws IOException;
    boolean searchStudent(Student s) throws IOException;
}
