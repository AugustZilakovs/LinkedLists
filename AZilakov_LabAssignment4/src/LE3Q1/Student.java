package LE3Q1;

public class Student {
    private String firstName;
    private double score;

    Student(){
        this.firstName = "Augusts";
        this.score = 90;
    }
    Student(String s, Double x){
        this.firstName = s;
        this.score = x;
    }
    @Override
    public String toString(){
        return (firstName+": "+score);
    }
}
