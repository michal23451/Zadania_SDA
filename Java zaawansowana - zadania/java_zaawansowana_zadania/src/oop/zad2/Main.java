package oop.zad2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan Kowalski", "Katowice, ul. Katowicka 1");
        System.out.println(person);
        Person person1 = new Person();
        System.out.println(person1);

        Student student = new Student("dzienne", 2, 33.3F);
        System.out.println(student);
        student.setName("Adam");
        student.setAddress("Mysłowice, Mysłowicka 2");
        System.out.println(student);

        Staff staff = new Staff("matematyka", 555.5F);
        staff.setName("Tomasz Tomaszewski");
        staff.setAddress("Warszawa Warszawska 3");
        System.out.println(staff);



    }
}