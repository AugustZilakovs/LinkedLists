package LE3Q2;

import java.util.Comparator;

public class HelperClassCompareLastNames implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
