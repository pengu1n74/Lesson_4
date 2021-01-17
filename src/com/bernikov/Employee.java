package com.bernikov;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee() {
        name = "Unknown";
        age = 999;
        phone = "+999 (999) 999-99-99";
        position = "Unknown";
        salary = 0;
        email = "unkown@gmail.com";
    }

    public Employee(String name, int age, String phone, String position, int salary, String email) {
        this.name = name;
        this.age = age;
        setPhone(phone);
        setPosition(position);
        setSalary(salary);
        setEmail(email);
    }

    public void getInfo(){
        System.out.printf("Name: %s\r\n Age: %d\r\n Position: %s\r\n Email: %s\r\n Number phone: %s\r\n Salary: %d $\r\n ", name, age, position, email, phone, salary);
        System.out.println("-----------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
