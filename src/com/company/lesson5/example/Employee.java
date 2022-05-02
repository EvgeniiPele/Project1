package com.company.lesson5.example;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee  [] persArray = new Employee[5];
        persArray [0] = new Employee("Ivanov Ivan Ivanovich", "manager", "ivanovii@gmail.com", "8900000000", 30000, 20);
        persArray [1] = new Employee("Ivanov Ivan Ivanovich1", "saller", "ivanovii1@gmail.com", "8900000001", 40000, 50);
        persArray [2] = new Employee("Ivanov Ivan Ivanovich2", "director", "ivanovii2@gmail.com", "8900000002", 50000, 41);
        persArray [3] = new Employee("Ivanov Ivan Ivanovich3", "IT", "ivanovii3@gmail.com", "8900000003", 60000, 30);
        persArray [4] = new Employee("Ivanov Ivan Ivanovich4", "security", "ivanovii4@gmail.com", "8900000004", 20000, 60);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge () > 40) System.out.println(persArray[i]);
        }
        }
}
