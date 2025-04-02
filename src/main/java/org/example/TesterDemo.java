package org.example;

public class TesterDemo {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Иванов");
        Tester tester2 = new Tester("Петр", "Петров", 3);
        Tester tester3 = new Tester("Сергей", "Сергеев", 5, "C1", 5000.0);

        System.out.println(Tester.getTesterInfo(tester1));
        System.out.println(Tester.getTesterInfo(tester2));
        System.out.println(Tester.getTesterInfo(tester3));

        tester1.increaseSalary(10); // на 10%
        tester2.increaseSalary(500); // на 500 единиц
        tester3.increaseSalary(5, true); // на 5% с учетом опыта

        System.out.println("\nПосле повышения зарплаты:");
        System.out.println(Tester.getTesterInfo(tester1));
        System.out.println(Tester.getTesterInfo(tester2));
        System.out.println(Tester.getTesterInfo(tester3));
    }
}
