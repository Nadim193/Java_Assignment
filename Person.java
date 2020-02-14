
package assignment;

public class Person{
            private String name;
            private int birthdayYear;
            
            public Person(){
                System.out.println("\t\t\t\t\t\tINFORMATION......\n\n");
            }
            public Person(String givenName, int yearOfBirth) {
                        name=givenName;
                        birthdayYear=yearOfBirth;
            }
            public void show(){
                        System.out.println("NAME : "+name);
                        System.out.println("BIRTHDAY YEAR : "+birthdayYear);
            }
            public void changename(String chname){
                        name=chname;
            }
            public void ageinyear(int inyear){
                        birthdayYear=inyear;
            }
            public String getName() {
                        return name;
            }
            public int getAgeInYears() { 
                        return birthdayYear;
            }
}
