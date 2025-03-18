// 6) Create a student class
// 	-create 5 student objects and store it in 
// 	a proper datastructure
// - find the average marks of the students

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q06 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 80));
        students.add(new Student("Vicky", 65));
        students.add(new Student("Jennie", 75));
        students.add(new Student("Lara", 90));
        students.add(new Student("Sam", 38));

        int total = 0;

        for (Student student : students) {
            total += student.marks;
        }

        double average = total / students.size();
        System.out.println("Average Marks of the students: " + average);
    }
}

// output
// @T-Lanojika ➜ /workspaces/Day01 (main) $ javac Q06.java
// @T-Lanojika ➜ /workspaces/Day01 (main) $ java Q06
// Average Marks of the students: 69.0