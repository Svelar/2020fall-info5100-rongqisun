package Assignments.Assignment8;

import com.sun.deploy.util.StringUtils;

import javax.swing.text.Style;
import java.util.*;

public class Email {

    private static int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName;
    private String lastName;
    private static String dep = "";
    private static String pass;
    private static String altEmail = "";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Worker: "+ firstName+ " "+ lastName+ "."+ " Department Codes:\n"+
                "1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner scanner = new Scanner(System.in);
        String line1 =scanner.nextLine();
        Email.SetDepartment(line1);

        while (true) {
            System.out.println("What do you want to do next?\n1 change password\n2 set the mailbox capacity\n3 define an alternate email address\n4 quit");
            String line = scanner.nextLine();
            if (line.equals("4")) {
                break;
            }
            if (line.equals("1")) {
                System.out.println("Please enter the new password");
                String s = scanner.nextLine();
                pass = s;
                continue;
            }
            if (line.equals("2")) {
                System.out.println("Please enter the mailbox capacity");
                String s = scanner.nextLine();
                mailboxCapacity = Integer.parseInt(s);
                continue;
            }
            if (line.equals("3")) {
                System.out.println("Please enter the alternate email address");
                String s = scanner.nextLine();
                altEmail = "\nAlTERNATE EMAIL: "+ s;
                continue;
            }
        }
        scanner.close();
    }

    private static void ChangePassword(){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String str = scan.next();
             pass= str;
        }
    }

    // Ask for the department
    private static String SetDepartment(String line) {
        switch (line){
            case "1" :
                dep= "sal";
                break;
            case "2" :
                dep= "dev";
                break;
            case "3" :
                dep= "acc";
                break;
            case "0" :
                dep= " ";
        }
        Email.dep= dep;
        return dep;
    }

    // Generate a random password
    private static String randomPassword(int length) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        List<String> passSet = Arrays.asList(str.split(""));
        List<String> password = new ArrayList<>();
        Random r = new Random();
        int setLength = passSet.size();
        for (int i = 0; i < length; i++) {
            password.add(passSet.get(r.nextInt(setLength-1)));
        }
        String passWord = StringUtils.join(password, "");
        pass = passWord;
        return passWord;
    }

    public String showInfo() {
        return "DISPLAY NAME: "+ firstName+" "+ lastName +
        "\nDEPARTMENT: "+ dep+
        "\nCOMPANY EMAIL: "+ firstName+"."+ lastName+ "@"+ dep+ "."+ companySuffix+ altEmail+
        "\nPASSWORD: "+ pass+
        "\nMAILBOX CAPACITY: "+ mailboxCapacity+ "mb";
    }
}
