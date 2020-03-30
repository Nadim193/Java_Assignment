
package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    
     public static void main(String[] args) {
         boolean flag = false;
         
         while(flag == false){
             
                    try{

                       int num1,num2,result;

                         Scanner Input = new Scanner(System.in);

                        System.out.print("PLEASE ENTER 1ST NUMBER : ");
                        num1=Input.nextInt();
                        System.out.print("PLEASE ENTER 2ND NUMBER : ");
                        num2=Input.nextInt();

                            if(num2==0||num1==0)

                                throw
                                        new ArithmeticException("/ by zero");
                            else
                                System.out.println("RESULT : "+(num1/num2));
                    }
                    catch(InputMismatchException | ArithmeticException e){
                        System.out.println(e);
                        System.out.println("YOU MAST ENTERR INTEGER. PLEASE TRY AGAIN");
                        continue;
                    }
                flag=true;
            }
        }
}

