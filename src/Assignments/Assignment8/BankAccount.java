package Assignments.Assignment8;

import java.util.Random;

public class BankAccount {
    private int balance;

    private synchronized void deposit(int amount){
        balance += amount;
        System.out.println("\n-----------------------------------\n\nDEPOSIT: "+ amount);
        getBalance();
    }

    private synchronized  void withdraw(int amount){
        if (balance-amount>=0){
            balance -= amount;
            System.out.println("\n-----------------------------------\n\nWITHDRAW: "+amount);
            getBalance();
        }else {
            System.out.println("\n-----------------------------------\n\nYOU ARE SO POOR!!!!");
        }
    }

    private void getBalance(){
        System.out.println("BALANCE: "+balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Random r = new Random();

        Thread thread1 = new Thread(() -> {
            int flag = 0;
            while (flag<10){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.deposit(r.nextInt(6000000));
                account.withdraw(r.nextInt(7000000));
                flag +=1;
            }
        });

        Thread thread2 = new Thread(() -> {
            int flag = 0;
            while (flag<10){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.deposit(r.nextInt(6000000));
                account.withdraw(r.nextInt(6000000));
                flag +=1;
            }
        });

        thread1.start();
        thread2.start();
    }
}
