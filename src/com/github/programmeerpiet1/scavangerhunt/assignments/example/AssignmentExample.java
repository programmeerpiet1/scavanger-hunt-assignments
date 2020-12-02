package com.github.programmeerpiet1.scavangerhunt.assignments.example;

import com.github.programmeerpiet1.scavangerhunt.assignments.domain.Gender;
import com.github.programmeerpiet1.scavangerhunt.assignments.domain.Piet;
import com.github.programmeerpiet1.scavangerhunt.assignments.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmentExample extends Assignment<Integer> {
    public AssignmentExample(final Piet[] pietjes) {
        super(pietjes);
    }

    @Override
    public Integer run() {
        /*
        * De de voorbeeldopdracht is als volgt:
        * Hoe veel mannelijke pieten er zijn boven de 25 jaar.
        *
        * note: Er zijn heel veel manieren om dit te doen, maar ik geef even 2 voorbeelden.
        * */

//        return countPietjesExampleOne();
        return countPietjesExampleTwo();
    }

    private int countPietjesExampleOne() {
        final List<Piet> malePietjesAbove25 = new ArrayList<>();
        for (final Piet piet : pietjes) {
            if (piet.getAge() > 25 && piet.getGender().equals(Gender.MALE)) {
                malePietjesAbove25.add(piet);
            }
        }
        return malePietjesAbove25.size();
    }

    private int countPietjesExampleTwo() {
        return (int) Arrays.stream(pietjes)
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getGender().equals(Gender.MALE))
                .count();
    }
}
