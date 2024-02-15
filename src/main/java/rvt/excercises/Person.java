package rvt.excercises;

public class Person {
    //username
    public String name;
    //adress
    public String address;

    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public String setAddress(String address){
        return this.address = address;
    }

    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                "}";
    }
    
}
