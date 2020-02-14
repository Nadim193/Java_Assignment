
package assignment;

public class Persontest {
    
        public static void main(String[] args) {
                    Person ob1 = new Person();
                    Person ob = new Person("NADIM HOSSAIN", 2000);
                    ob.show();
                    ob.changename("NADIM HOSSAIN");
                    ob.ageinyear(20);
                    System.out.println("");
                    System.out.println("NAME : "+ob.getName());
                    System.out.println("AGE : "+ob.getAgeInYears());
    }
}