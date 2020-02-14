
package assignment;

public class A {

        private int n;
        
         public A(){
                 n = 0;
        }
        public A(int a){
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
