
package assignment;

public class Bank extends Account2 {
    
        private double amount;
        private String account;
        
        public void setdeposit(double amu, String acc){
                        amount=amu;
                        account=acc;
        }
        public double getdepositamu(){
                        return amount;
        }
         public String getdepositacc(){
                        return account;
        }
        public void setwithdraw(double amu, String acc){
                        amount=amu;
                        account=acc;
        }
         public double getwithdrawamu(){
                        return amount;
        }
         public String getwithdrawacc(){
                        return account;
        }
        public void settransfer(double amu, String acc){
                        amount=amu;
                        account=acc;
        }
        public double gettransferamu(){
                        return amount;
        }
         public String gettransferacc(){
                        return account;
        }
        public void printBalancesdep(){
                System.out.println("ACCOUNT NAME : "+getdepositacc());
                System.out.println("BALANCE : "+amount);
        }
        public void printBalanceswith(){
                System.out.println("ACCOUNT NAME : "+getdepositacc());
                System.out.println("WITHDRAW : "+getdepositamu());
        }
        public void printBalancestran(){
                System.out.println("ACCOUNT NAME : "+gettransferacc());
               // System.out.println("NOW BALANCE IS : "+(getdepositamu()-gettransferamu()));
        }
        
}
