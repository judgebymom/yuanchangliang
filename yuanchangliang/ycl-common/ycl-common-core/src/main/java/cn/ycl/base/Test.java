package cn.ycl.base;

import java.util.ArrayList;
import java.util.Comparator;

class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 1000; i++) {
            Student student = new Student("a"+i);
            students.add(student);
        }
        students.sort(Comparator.comparing(Student::getId).reversed());

        for (int i = 0; i <students.size() ; i++) {
            System.out.println(students.get(i).getId());
        }
    }
}
class Student{
    String name;
     Double id;

    public Student(String name) {
        this.name = name;
        this.id = Math.random()*10000;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }
}