package rvt.excercises;

public class Student extends Person{
    public Integer credits;
    public Integer study;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
        this.study = 0;
    }

    public void study(){
        this.credits++;
    }

    public int credits(){
        return this.credits;
    }

    @Override
    public String toString() {
        return name + "\n  " + 
        address + "\n  Study credits " + credits;
    }
}
