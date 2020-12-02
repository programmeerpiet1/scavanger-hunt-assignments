package com.github.programmeerpiet1.scavangerhunt.assignments.domain;

public class Piet {
    private final String name;
    private final int age;
    private final Gender gender;

    public Piet(final String name, final int age, final Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return name + "piet";
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Piet piet = (Piet) o;

        if (age != piet.age) return false;
        if (!name.equals(piet.name)) return false;
        return gender == piet.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Piet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
