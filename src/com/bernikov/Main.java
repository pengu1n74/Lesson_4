package com.bernikov;

public class Main {

    public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.getInfo();

	Employee[] employees = {
	        new Employee("Alex Brawn",35,"+7(999)123-45-67","Team leader", 3000,"Alex74@gmail.com"),
            new Employee("Mike Beasley",32,"+7(900)456-73-54","Developer senior", 2500,"MikeBeasley@gmail.com"),
            new Employee("Thomas Griffin",48,"+7(907)352-45-24","Developer middle", 2000,"Thomas99995555@gmail.com"),
            new Employee("George Young",25,"+7(951)987-32-45","Developer junior", 1000,"George@gmail.com"),
            new Employee("Briana Ward",19,"+7(905)927-38-76","Human Resource", 1500,"counterstrike1111@gmail.com")
    };
        System.out.println("Employees over 40 years :");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge()>=40) employees[i].getInfo();
        }
    }
}
