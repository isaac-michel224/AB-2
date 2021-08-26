import javax.swing.*;
import java.util.ArrayList;




public class AddressBook {
    ArrayList<PersonInfo> persons;


    public AddressBook () {
        persons = new ArrayList<PersonInfo>();
    }

    //add a new person

    public void addPerson() {
        String name = JOptionPane.showInputDialog("Enter name");
        String add = JOptionPane.showInputDialog("Enter address");
        String pNum = JOptionPane.showInputDialog("Enter phone no");
        String email = JOptionPane.showInputDialog("Enter email");
        //construct new person

        PersonInfo p = new PersonInfo(name, add, pNum, email);

        persons.add(p);
    }



    //search person record by names
    public void searchPerson(String n) {
        for (int i = 0; i<persons.size(); i++) {
            PersonInfo p = (PersonInfo)persons.get(i);
            if (n.equals(p.getName()) ) {
                p.print();
            }
        }
    }

    //delete Person
    public void deletePerson(String n) {
        for (int i = 0; i<persons.size(); i++) {
            PersonInfo p = (PersonInfo)persons.get(i);
            if (n.equals(p.getName()) ) {
                p.print();
                persons.remove(i);
            }
        }
    }

    public void print() {
        for (PersonInfo person : persons) {
           person.print();
        }
    }

    public void eraseAddressBook() {
persons.clear();
    }
}
