
package assignment;

public class problem1 {

        private int n;
        
         public problem1(){
                 n = 0;
        }
        public problem1(int a){
                 n = a;
        }
        public void f() {
                 n++;
        }
        public void g(){ 
                f();
                n = 2 * n;
                f();
        }
        public int h() {
                return n;
        } 
        public void k(){
                System.out.println(n);
        }
}