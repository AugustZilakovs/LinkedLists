package LE3Q2;

import java.util.Comparator;

public class HelperClassCompareFirstNames implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.getFirstName().compareTo(b.getFirstName());
    }

}
