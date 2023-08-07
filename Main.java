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
                // For Loop break, continue
              for(int s = 0; s < 6; s++) {
                  if (s == 3) {
                      break;      // print stop b4 3
                  }

                  System.out.println(s);
              }


              for(int t = 0; t < 6; t++) {
                  if (t == 3) {
                      continue;      // skip 3 and continue the next iteration in the loop
                  }

                  System.out.println(t);
              }


              // while Loop break, continue

              int i1 = 0;
                      while (i1 < 10) {
                          System.out.println(i1);
                          i1++;
                          if (i1 == 4) {
                              break;
                          }
                      }

              int m = 0;
              while (m < 10) {

                  if (m == 4) {
                      m++;
                      continue;
                  }
                  System.out.println(m);
                  m++;
              }

// loop through the items in the cars array.

              String[] cars = {"Volvo","BMW"};
              for (String r : cars) {
                  System.out.println(r);

              }








          }



      }

  }


}
