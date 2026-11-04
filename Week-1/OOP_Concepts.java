/*Create a class Student with attributes name, marks, and roll number.*/

class OOP_Concepts {

    String name;
    int marks;
    int rollNumber;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        OOP_Concepts s1 = new OOP_Concepts();

        s1.name = "Taniya";
        s1.rollNumber = 31;
        s1.marks = 85;

        s1.display();
    }
}


//2. Implement a BankAccount class with deposit() and withdraw() methods.

class BankAccount {

    double balance = 1000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.checkBalance();

        b1.deposit(500);

        b1.withdraw(200);

        b1.checkBalance();
    }
}

//3. Demonstrate inheritance using classes Vehicle → Car.

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {

    void display() {
        System.out.println("Car is running.");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();
        c1.display();
    }
}

//4. Create an interface Shape with area() and perimeter() methods.

interface Shape {

    double area();

    double perimeter();
}

class Circle implements Shape {

    double radius = 5;

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        System.out.println("Area of Circle: " + c.area());

        System.out.println("Perimeter of Circle: " + c.perimeter());
    }
}

//5. Write a program showing method overloading and overriding*/

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Parent {

    void display() {
        System.out.println("This is Parent class.");
    }
}

class Child extends Parent {

    // Method Overriding
    void display() {
        System.out.println("This is Child class.");
    }
}

class Assignment {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(10, 20));

        System.out.println("Sum of three numbers: " + c.add(10, 20, 30));

        Parent p = new Parent();
        p.display();

        Child ch = new Child();
        ch.display();
    }
}


    

