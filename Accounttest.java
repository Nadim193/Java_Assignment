
package assignment;

import java.util.Scanner;

public class Accounttest {
    
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double balance,with_draw;
                
                
                 Account account = new Account(10000);
                 account.balance();
                 
                System.out.print("ADD BALANCE : ");
                balance=input.nextDouble();
                account.add(balance);
                
                account.inquire();
                
                System.out.print("WITH DRAW BALANCE : ");
                with_draw=input.nextDouble();
                account.setwith_draw(with_draw);
                
                account.penalty();
    }
}
