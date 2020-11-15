package Assignments.Assignment8;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
    }

/*
    OUTPUT:
    New Worker: John Smith. Department Codes:
            1 for Sales
            2 for Development
            3 for Accounting
            0 for none
    Enter department code:
2
    What do you want to do next?
            1 change password
            2 set the mailbox capacity
            3 define an alternate email address
            4 quit
1
    Please enter the new password
ASZXD@SD!!!
    What do you want to do next?
            1 change password
            2 set the mailbox capacity
            3 define an alternate email address
            4 quit
2
    Please enter the mailbox capacity
300
    What do you want to do next?
            1 change password
            2 set the mailbox capacity
            3 define an alternate email address
            4 quit
3
    Please enter the alternate email address
sun.ron@northeastern.edu
    What do you want to do next?
            1 change password
            2 set the mailbox capacity
            3 define an alternate email address
            4 quit
4
    DISPLAY NAME: John Smith
    DEPARTMENT: dev
    COMPANY EMAIL: John.Smith@dev.aeycompany.com
    AlTERNATE EMAIL: sun.ron@northeastern.edu
    PASSWORD: ASZXD@SD!!!
    MAILBOX CAPACITY: 300mb

    Process finished with exit code 0
*/

}
