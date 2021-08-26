import javax.swing.*;

public class TestBook {


    public static void main (String args[]) {
        AddressBook ab = new AddressBook();
        String input, s;
        int cs;
        while (true) {
            input = JOptionPane.showInputDialog("Enter 1 to Add " + "\n Enter 2 to Delete" + "\n Enter 3 to Search" + "\n Enter 4 to Print"
                    + "\n Enter 5 to Erase" + "\n Enter 6 to Exit" );
            cs = Integer.parseInt(input);
            switch (cs) {
                case 1:
                ab.addPerson();
                break;
                case 2:
                s = JOptionPane.showInputDialog("Enter name to delete ");
                    JOptionPane.showMessageDialog(null, "Entry deleted");
                ab.deletePerson(s);
                break;
                case 3:
                s = JOptionPane.showInputDialog("Enter name to search ");
                ab.searchPerson(s);
                    break;
          case 4:
              ab.print();
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Address Book is Cleared!");
                     ab.eraseAddressBook();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error Message ");
                    break;

            }
        }
    }
}

