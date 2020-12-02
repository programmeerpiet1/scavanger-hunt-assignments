package com.github.programmeerpiet1.scavangerhunt;

import com.github.programmeerpiet1.scavangerhunt.assignments.domain.Gender;
import com.github.programmeerpiet1.scavangerhunt.assignments.domain.Piet;
import com.github.programmeerpiet1.scavangerhunt.assignments.example.AssignmentExample;
import com.github.programmeerpiet1.scavangerhunt.assignments.Assignment;
import com.github.programmeerpiet1.scavangerhunt.assignments.one.AssignmentOne;
import com.github.programmeerpiet1.scavangerhunt.assignments.three.AssignmentThree;
import com.github.programmeerpiet1.scavangerhunt.assignments.two.AssignmentTwo;

public class Main {

    public static void main(String[] args) {

        // Begin voorbeeld
        Piet[] examplePietjes = getExamplePietjes();

        Assignment<Integer> assignmentExample = new AssignmentExample(examplePietjes);
        Integer assignmentExampleResult = assignmentExample.run();
        System.out.println("Het resultaat van de voorbeeldopdracht");
        System.out.println(assignmentExampleResult);
        System.out.println();
        // Einde voorbeeld

        // Pietjes data
        Piet[] pietjes = getPietjes();

        // Opdracht 1
        Assignment<String> assignmentOne = new AssignmentOne(pietjes);
        String assignmentOneResult = assignmentOne.run();
        System.out.println("Het resultaat van opdracht 1:");
        System.out.println(assignmentOneResult);
        System.out.println();


        // Opdracht 2
        Assignment<Integer> assignmentTwo = new AssignmentTwo(pietjes);
        Integer assignmentTwoResult = assignmentTwo.run();
        System.out.println("Het resultaat van opdracht 2:");
        System.out.println(assignmentTwoResult);
        System.out.println();


        // Opdracht 3
        Assignment<Integer> assignmentThree = new AssignmentThree(pietjes);
        Integer assignmentThreeResult = assignmentThree.run();
        System.out.println("Het resultaat van opdracht 3:");
        System.out.println(assignmentThreeResult);
    }

    private static Piet[] getExamplePietjes() {
        Piet piet1 = new Piet("programmeer", 26, Gender.MALE);
        Piet piet2 = new Piet("inpak", 21, Gender.FEMALE);
        Piet piet3 = new Piet("hoofd", 65, Gender.MALE);
        return new Piet[]{piet1, piet2, piet3};
    }

    private static Piet[] getPietjes() {
        Piet piet1 = new Piet("programmeer", 26, Gender.MALE);
        Piet piet2 = new Piet("inpak", 21, Gender.FEMALE);
        Piet piet3 = new Piet("hoofd", 65, Gender.MALE);
        return new Piet[]{piet1, piet2, piet3};
    }
}
