
package assignment;

public class Account {
            private double balance,with_draw,addbalance;
            
            public Account(){
                    balance=0;
            }
            public Account(double bl){
                    balance=bl;
            }
            public double getaccount(){
                    return balance;
            }
            public void balance(){
                System.out.println("BALANCE IS : "+balance+"$");
            }
            public void add(double bla){
                    addbalance=bla;
                    double add;
                    add=(balance+addbalance);
                    System.out.println("NOW YOUR BALANCE : "+add+"$");
            }
            public void inquire(){
                    System.out.println("CURRENT BALANCE : "+(0.05+balance+addbalance)+"$");
            }
            public void setwith_draw(double with){
                     with_draw=with;
            }
            public void with_draw(){
                System.out.println("WITH DRAW : "+getwith_draw()+"$");
            }
            public double getwith_draw(){
                    return with_draw;
            }
            public void penalty(){
                    double add;
                    add=(0.05+balance+addbalance);
                    if(getwith_draw()>add){
                                System.out.println("YOU GET PENALTY!!..NOW YOUR CURRENT BALANCE IS : "+(add-5)+"$");
                    } 
                    else if(add==0){
                        System.out.println("THERE IS NO MONEY IN YOUR ACCOUNT..");
                    }
                    else{
                        with_draw();
                        System.out.println("NOW YOUR CURRENT BALANCE IS : "+((0.05+balance+addbalance)-getwith_draw())+"$");
                    }
            }
}