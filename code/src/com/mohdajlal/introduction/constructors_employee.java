package com.mohdajlal.introduction;

// constructors are use to initialize an object
public class constructors_employee {
    static class employee{
        String name;
        int age;

        public employee(String em_name, int emage){
            this.name = em_name;
            this.age = emage;
        }
    }
    public static void main(String[] args) {
        employee emp1 = new employee("Mohd Ajlal", 18);
        employee emp2 = new employee("Mohhd Anas", 25);
        System.out.println(emp1.name);
        System.out.println(emp2.age);
    }
}
