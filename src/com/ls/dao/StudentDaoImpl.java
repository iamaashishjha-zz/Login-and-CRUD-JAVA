package com.ls.dao;

import com.ls.bll.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void saveStudent(Student s) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt", true))) {
            bw.write(s.getSID() + "," + s.getsName() + "," + s.getsAddress() + "," + s.getsCourse());
            bw.flush();
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateStudent(Student s) throws IOException {
        try{
            File db = new File("Student.txt");
            
            BufferedReader br  = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(db));
            
            String[] splt = null;
            String line = br.readLine();
            while(line != null){
                splt = line.split(",");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public void listStudent(int SID) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(int SID) throws IOException {
        try {
            File db = new File("Student.txt");
            File temp = new File("tempFile.txt");
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            String line = null;
            String[] splt = null;
            Student s = new Student();
            int sid = s.getSID();
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (!splt[0].equals(sid)) {
                    bw.write(splt[0] + "," + splt[1] + "," + splt[2] + "," + splt[3] + ",");
                    bw.flush();
                    bw.newLine();
                    break;
                }
            }
            bw.close();
            br.close();
            
            db.delete();
            temp.renameTo(db);
          
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public ArrayList<String> getAlLStudents() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("Student.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
    }

    @Override
    public boolean checkSid(Student s) throws IOException {
        boolean found = false;
        try {
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[0].equals(s.getSID())) {
                    found = true;
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    @Override
    public boolean checkStudent(Student s) throws IOException {
        boolean found = false;
        try {
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[0].equals(s.getSID())) {
                    found = true;
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

}
