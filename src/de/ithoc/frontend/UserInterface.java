package de.ithoc.frontend;
import java.util.Scanner;

public class UserInterface {

    
    private String name;
    private String id;

    public void scanAttributeName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
    }

    public void scanAttributeId() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        id = scan.nextLine();
    }
    public String getAttributeName() {
        return name;
    }

    public void setattributeName(String name) {
        this.name = name;
    }

    public String getattributeId() {
        return id;
    }

    public void setattributeValue(String id) {
        this.id = id;
    }
}
    
