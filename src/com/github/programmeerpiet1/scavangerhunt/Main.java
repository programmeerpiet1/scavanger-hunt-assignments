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

        Assignment<Long> assignmentExample = new AssignmentExample(examplePietjes);
        Long assignmentExampleResult = assignmentExample.run();
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
        Assignment<Long> assignmentTwo = new AssignmentTwo(pietjes);
        Long assignmentTwoResult = assignmentTwo.run();
        System.out.println("Het resultaat van opdracht 2:");
        System.out.println(assignmentTwoResult);
        System.out.println();


        // Opdracht 3
        Assignment<Double> assignmentThree = new AssignmentThree(pietjes);
        Double assignmentThreeResult = assignmentThree.run();
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
        Piet piet1 = new Piet("Programmeer", 26, Gender.MALE);
        Piet piet2 = new Piet("Inpak", 21, Gender.FEMALE);
        Piet piet3 = new Piet("Hoofd", 65, Gender.MALE);
        Piet piet4 = new Piet("Wegwijs", 31, Gender.MALE);
        Piet piet5 = new Piet("Malle", 19, Gender.MALE);
        Piet piet6 = new Piet("Pakjes", 32, Gender.FEMALE);
        Piet piet7 = new Piet("Post", 56, Gender.MALE);
        Piet piet8 = new Piet("Bak", 45, Gender.MALE);
        Piet piet9 = new Piet("Keuken", 66, Gender.FEMALE);
        Piet piet10 = new Piet("Snoep", 22, Gender.FEMALE);
        Piet piet11 = new Piet("Strooi", 33, Gender.MALE);
        Piet piet12 = new Piet("Huis", 34, Gender.FEMALE);
        Piet piet13 = new Piet("Ongeluk", 23, Gender.MALE);
        Piet piet14 = new Piet("Voetbal", 26, Gender.MALE);
        Piet piet15 = new Piet("Slaap", 72, Gender.MALE);
        Piet piet16 = new Piet("Prof", 65, Gender.FEMALE);
        Piet piet17 = new Piet("Narren", 21, Gender.MALE);
        Piet piet18 = new Piet("Staf", 25, Gender.FEMALE);
        Piet piet19 = new Piet("Paarden", 36, Gender.FEMALE);
        Piet piet20 = new Piet("Regel", 44, Gender.MALE);
        Piet piet21 = new Piet("Acrobaat", 18, Gender.FEMALE);
        Piet piet22 = new Piet("Dans", 20, Gender.FEMALE);
        Piet piet23 = new Piet("Rijm", 66, Gender.MALE);
        Piet piet24 = new Piet("Opa", 83, Gender.MALE);
        Piet piet25 = new Piet("Oma", 81, Gender.FEMALE);
        Piet piet26 = new Piet("Hoofd", 65, Gender.MALE);
        Piet piet27 = new Piet("Wegwijs", 31, Gender.MALE);
        Piet piet28 = new Piet("Malle", 43, Gender.MALE);
        Piet piet29 = new Piet("Pakjes", 32, Gender.FEMALE);
        Piet piet30 = new Piet("Post", 56, Gender.MALE);
        Piet piet31 = new Piet("Bak", 45, Gender.MALE);
        Piet piet32 = new Piet("Voetbal", 26, Gender.MALE);
        Piet piet33 = new Piet("Slaap", 72, Gender.MALE);
        Piet piet34 = new Piet("Prof", 65, Gender.FEMALE);
        Piet piet35 = new Piet("Acrobaat", 18, Gender.FEMALE);
        Piet piet36 = new Piet("Dans", 20, Gender.FEMALE);
        Piet piet37 = new Piet("Rijm", 66, Gender.MALE);
        Piet piet38 = new Piet("Opa", 83, Gender.MALE);
        return new Piet[]{piet1, piet2, piet3, piet4, piet5, piet6, piet7, piet8, piet9, piet10,
        piet11, piet12, piet13, piet14, piet15, piet16, piet17, piet18, piet19, piet20,
        piet21, piet22, piet23, piet24, piet25, piet26, piet27, piet28, piet29, piet30,
        piet31, piet32, piet33, piet34, piet35, piet36, piet37, piet38, piet3, piet6,
        piet12, piet14, piet18, piet23, piet27, piet34, piet38};
    }
}
