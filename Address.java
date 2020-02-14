
package assignment;

public class Address {
    
            private int house_number,post_code,apartment_number;
            private String street_name,city,state;
            
            public Address(){
                
            }
            public Address(int hn,int pc,int an,String sn,String cit,String st){
                           house_number=hn;
                           post_code=pc;
                           apartment_number=an;
                           street_name=sn;
                           city=cit;
                           state=st;
            }
            public void print(){
                        System.out.print(house_number);
                        System.out.print(street_name);
                        System.out.print(city);
                        System.out.println(state);
                        System.out.println(1700);
            }
            public void compared(){
                        if(post_code==1700){
                                System.out.print(house_number);
                        }
                        else{
                                System.out.println(apartment_number);
                        }
            }
}
