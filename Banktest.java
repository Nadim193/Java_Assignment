
package assignment;

import java.util.Scanner;

public class Banktest {
    
     public static void main(String[] args) {
                    double amount,deposit,with_draw;
                    
                    Scanner input = new Scanner(System.in);
                    
                    Bank saving = new Bank();
                    
                    saving.balance();
                    System.out.print("ENTER AMOUNT FOR DEPOSIT : ");
                    deposit=input.nextDouble();
                    saving.setdeposit(deposit,"NADIM HOSSAIN");
                    saving.printBalancesdep();
                    System.out.print("ENTER AMOUNT FOR WITH DRAW : ");
                    with_draw=input.nextDouble();
                    saving.setwithdraw(with_draw,"NADIM HOSSAIN");
                    saving.printBalanceswith();
                    System.out.println("NOW BALANCE IS : "+(deposit-with_draw));
                    
                    Bank checking = new Bank();
                   
                    
                    System.out.print("ENTER AMOUNT FOR TRANSFER : ");
                    amount=input.nextDouble();
                    checking.settransfer(amount,"NADIM HOSSAIN");
                    checking.printBalancestran();
                    System.out.println("NOW BALANCE IS : "+((deposit-with_draw)-amount));
                    
                     
         
    }
}
