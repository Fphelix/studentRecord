/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecord;

import java.util.*;

/**
 *
 * @author wwstudent
 */
public class Student {

    private String ID;
    private String stName;
    private int[] grades = new int[3];

    public Student() {
    }

    public Student(String ID, String stName, int[] grades) {
        this.ID = ID;
        this.stName = stName;
        this.grades = grades;
    }

    public void setStudent(String ID) {
        this.ID = ID;
    }

    public void setStudentName(String stName) {
        this.stName = stName;
    }

    public void setgrades(int[] grades, Scanner k) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = k.nextInt();

        }
    }

    public String getStudent() {
        return ID;
    }

    public String getStudentName() {
        return stName;
    }

    public int[] getgrades() {
        return grades;
    }
     @Override
 public String toString(){
 String msg = "";
  for (int a = 0; a<grades.length;a++)
    {msg += grades[a]+ "\t";
	 }
	 return "Student ID: " + this.ID + " student name: " + stName
	       + " Student Grades: " + msg;
 }

}
