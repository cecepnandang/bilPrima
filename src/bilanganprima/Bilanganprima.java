
package bilanganprima;


public class Bilanganprima {

    public static void main(String[] args) {
      int a,b ;
      for (a = 1; a<=1000; a++) {
          int x = 0;
          for(b = 2; b<=a; b++) {
              
      if (a % b == 0) {
          if(a != b) {
              x = 1;
          }
       if (x != 1 && a == b) {
           System.out.println(a);
             }
            }
          }
       }
    }
    
}
