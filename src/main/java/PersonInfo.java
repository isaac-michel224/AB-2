import javax.swing.*;

public class PersonInfo {
    private String name;
    private String address;
    private String phoneNum;
    private String email;


    public void setName(String sname) {
        name = sname;
    }

    public void setAddress(String saddress) {
        address = saddress;
    }

    public void setphoneNum(String sphoneNum) {
        phoneNum = sphoneNum;
    }

    public void setEmail(String semail) {
        email = semail;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public PersonInfo(String n, String a, String p, String e) {
        setName(n);
        setAddress(a);
        setphoneNum(p);
        setEmail(e);
    }

    public void print() {
        JOptionPane.showMessageDialog(null, "Name: " +
                name + " " + "Address:" +
                address + " " +
                "Phone no:" +
                phoneNum + " "
                + "Email: "
                + email);
    }
}