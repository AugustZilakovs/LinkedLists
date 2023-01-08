package LE3Q1;

public class Driver {
    public static void main(String[] args){
        header(3,1);
        DoublyLinkedList<Student> augustList= new DoublyLinkedList<>();
        Student s0 = new Student();
        Student s1 = new Student("Harry",67.35);
        Student s2 = new Student("Luna",87.5);
        Student s3 = new Student("Vincent",60.5);
        Student s4 = new Student("Hermione",89.2);
        augustList.addLast(s0);augustList.addLast(s1);augustList.addLast(s2);augustList.addLast(s3);
        System.out.println("\nAdding 4 students to the list.\n" +
                "The list Content:");
        System.out.println("Current List: "+augustList);
        augustList.addBetween(s4,augustList.findNode(s2),augustList.findNode(s3));
        System.out.println("\nAdding Hermione to the list in between Luna and Vincent.....\n" +
                "The list Content:");
        System.out.println("Current List: "+augustList);
        footer(3,1);

    }
    public static void footer(int x, int q){//footer
        System.out.println("\nCompletion of Lab Exercise " + x +"-Q"+q+" is successful!\nSigning off - Augusts.");
    }
    public static void header(int x, int q){//header
        System.out.println("\nLab Exercise " + x +"=Q"+q);
        System.out.println("Prepared By: Augusts Zilakovs" +
                "\nStudent Number: 251223010" +
                "\nGoal of this Exercise: Create and use a Doubly Linked List");
    }
}
