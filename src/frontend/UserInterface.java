package frontend;
import java.util.Scanner;

public class UserInterface {
    private String name;
    private String id;

    public void scanAttributeName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the attribute: ");
        name = scan.nextLine();
    }

    public void scanAttributeValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of the attribute: ");
        id = scan.nextLine();
    }
    public String getAttributeName() {
        return name;
    }

    public void setattributeName(String name) {
        this.name = name;
    }

    public String getattributeValue() {
        return id;
    }

    public void setattributeValue(String id) {
        this.id = id;
    }
    
    
}
