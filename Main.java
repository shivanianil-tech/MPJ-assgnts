import java.io.*;

interface Display {
    void show();
}
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void work();
}

class Student extends Person implements Display {

    Student(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is studying");
    }

    public void show() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        Student s = new Student("Shiv");

        s.work();
        s.show();

        FileWriter fw = new FileWriter("data.txt");
        fw.write("Hello File Handling");
        fw.close();

        System.out.println("Data written to file");
    }
}