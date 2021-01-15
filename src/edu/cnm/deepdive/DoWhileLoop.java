package edu.cnm.deepdive;

public class DoWhileLoop {

  public static void main(String[] args) {

    int a = 0;

    do {
      a++;
    } while (false);
    System.out.println("a = " + a);

    //while loop
    int x = 20;

    while (x > 10) x--;
    System.out.println("x = " + x);// output will be 10.

    //do-while loop
    int x2 = 20;

    do {
      x2--;
    } while (x2 > 10);//
    System.out.println("x2 = " + x2);//output will also be 10.

    int y = 10;
    int z = 5;

    while (y < 20)
      y++;//since there are no brackets, only line 32 is within the while block as rewritten below:
    /*
    while (y < 20) {
      y++;
      }
      z += 2;
      y += 10;
     */
      z += 2;
      y += 10;

    System.out.println("y = " + y + " z = " + z);

    int number = 10;
    while (number > 10) {
      number--;
    }
    do {
      number--;

      while(number > 5) {
        number += 1;
      }
    } while (number < 10);//infinitive loop.
    System.out.println("number is " + number);
  }
}
