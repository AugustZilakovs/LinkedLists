package LE3Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DriverForStudentClass {
    public static void main(String[] args){
        header(3,2);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        studentList.add(new Student("Harry","Potter",75.5));
        studentList.add(new Student("Ronald","Weasley",86.0));
        studentList.add(new Student("Hermoine","Granger",91.7));
        studentList.add(new Student("Parvati","Patil",93.75));
        System.out.println("The Score Card: ");
        System.out.println(studentList.toString().replace("[", "").replace("]", "").replace(", ",""));

        Collections.sort(studentList);
        System.out.println("The sorted list in terms of score in descending order....");
        System.out.println(studentList.toString().replace("[", "").replace("]", "").replace(", ",""));

        System.out.println("The sorted list in terms of Last Names....");
        Collections.sort(studentList, new HelperClassCompareLastNames());
        System.out.println(studentList.toString().replace("[", "").replace("]", "").replace(", ",""));


        System.out.println("The sorted list in terms of first Names....");
        Collections.sort(studentList, new HelperClassCompareFirstNames());
        System.out.println(studentList.toString().replace("[", "").replace("]", "").replace(", ",""));

        footer(3,2);
    }
    public static void footer(int x, int q){//footer
        System.out.println("Completion of Lab Exercise " + x +"-Q"+q+" is successful!\nSigning off - Augusts.");
    }
    public static void header(int x, int q){//header
        System.out.println("Lab Exercise " + x +"=Q"+q);
        System.out.println("Prepared By: Augusts Zilakovs" +
                "\nStudent Number: 251223010" +
                "\nGoal of this Exercise: Use Collections and Comparator interface\n");
    }
}
