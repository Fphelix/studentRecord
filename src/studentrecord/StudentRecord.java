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
public class StudentRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String studentID, studentName;
        Student[] classList = new Student[2];
        int[] Grades = new int[3];
        for (int j = 0; j < classList.length; j++) {
            System.out.println(" Enter the student ID: ");
            studentID = kb.nextLine();
            System.out.println(" Enter the student name: ");
            studentName = kb.nextLine();

            for (int n = 0; n < Grades.length; n++) {
                System.out.println(" Enter the student grades " + (n + 1)
                        + ":");
                Grades[n] = kb.nextInt();
                // TODO code application logic here
            }
            classList[j] = new Student(studentID, studentName, Grades);
            System.out.println(classList[j]);
            String newLine = kb.nextLine();
        }
    }
}
