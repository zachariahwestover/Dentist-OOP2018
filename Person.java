import java.util.*;

public class Person{
    public String last;
    public String first;
    public String zip;

    public Person(){
        last = "X";
        first = "X";
        zip = "X";
    }
    
    public Person(String l, String f, String z){
        last = l;
        first = f;
        zip = z;
    }

    public void displayPerson(){
        System.out.println(last + ", " + first + "\n" + zip);
    }

    public static void main (String [] args){
        Person person1 = new Person();
        Person person2 = new Person(args[0], args[1], args[2]);

        person1.displayPerson();
        person2.displayPerson();
    }
}