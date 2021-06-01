
package com.ls.dao;

import com.ls.bll.Student;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class StudentDaoImpl implements StudentDao{

    @Override
    public void create(Student s) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt", true))){
            bw.write(s.getSID()+","+s.getsName()+","+s.getsAddress()+","+s.getsCourse());
            bw.flush();
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
