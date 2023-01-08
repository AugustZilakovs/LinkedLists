package LE3Q2;
import java.util.*;

public class Student implements Comparable <Student> {

    private String firstName;
    private String lastName;
    private double score;
    Student() {
        this.firstName = "Augusts";
        this.lastName = "Zilakovs";
        this.score = 100;
    }
    Student(String s,String s2, Double x) {
        this.firstName = s;
        this.lastName = s2;
        this.score = x;
    }
    public double getScore(){
        return score;
    }
    public void setScore(Double x){
        this.score=x;
    }
    @Override
    public String toString() {
        return (firstName+" "+lastName + ": " + score+"\n");
    }
    @Override
    public int compareTo(Student x){
        if(this.getScore()>x.getScore())
             return (-1);
        else if(this.getScore()<x.getScore())
            return (1);
        else
            return 0;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String x){
        this.firstName=x;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String x){
        this.lastName=x;
    }

}
