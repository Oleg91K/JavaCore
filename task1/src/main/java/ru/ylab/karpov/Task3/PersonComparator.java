package ru.ylab.karpov.Task3;

import java.util.Comparator;

public class PersonComparator implements Comparator<ComplexExamples.Person> {


    @Override
    public int compare(ComplexExamples.Person o1, ComplexExamples.Person o2) {
        Integer id1 = o1.getId();
        Integer id2 = o2.getId();
        return id1.compareTo(id2);
    }
}
