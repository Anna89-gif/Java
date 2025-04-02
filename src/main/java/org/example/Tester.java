package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "B1");
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 1000.0 * expirienceInYears);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }


    public void increaseSalary(double percentage) {
        this.salary *= (1 + percentage / 100);
    }

    public void increaseSalary(int fixedAmount) {
        this.salary += fixedAmount;
    }

    public void increaseSalary(double percentage, boolean considerExperience) {
        if (considerExperience) {
            this.salary *= (1 + percentage / 100 * this.expirienceInYears);
        } else {
            increaseSalary(percentage);
        }
    }

    public static String getTesterInfo(Tester tester) {
        return String.format("Tester %s %s: %d years exp, %s English, salary %.2f",
                tester.name, tester.surname, tester.expirienceInYears, tester.englishLevel, tester.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
