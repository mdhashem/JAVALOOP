public class Main {

  public static void main(String[] args){
      int i = 0;
      while (i < 5) {

          System.out.println(i); // The code in the loop will run over and over variable(i) less 5
          i++;

         // do while
          int j = 1;
          do {
              System.out.println(j);
              j++;
          }
          while (j < 5);
          /* when you know exactly how many times want to loop through a block of code, use
          the for loop instead of while loop
           */

          // Syntax
          for ( int m = 0; m < 5; m++) {
              System.out.println(m);
          }
    // Only print even values between 0 and 10

          for ( int s = 0; s <= 10; s = s+2) {
              System.out.println(s);

          }

          // Nested loop

          // Outer loop
          for ( int k =  1; k <= 2; k++) {
              System.out.println("Outer: "+ k); // Executes 2 times

              // Inner loop

              for ( int n =  1; n <= 3; n++) {
                  System.out.println("Inner: " + n); // Executes 6 times (2*3)
              }

          }


      }

  }


}
