package rvt;

import jakarta.validation.constraints.NotEmpty;


public class Students {

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty
    private String surname;

    private String group;

    private int age;

    private String day;

    public Students(String name, String surname, String group, int age, String day) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.age = age;
        this.day = day;
    }

    public Students() {
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

    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", day='" + day + '\'' +
                '}';
    }
}