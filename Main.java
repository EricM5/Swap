import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int y, x;
    System.out.print("Enter a number: ");
    Scanner in = new Scanner (System.in);
    x = in.nextInt();
    System.out.print("Enter another number: ");
    y = in.nextInt();
    System.out.println();
    System.out.print("x = " + x + " y = " + y + "\n");
    
    System.out.print("\nLet's swap the two values!");
    y = x + y;
    x = y - x;
    y = y - x;
    System.out.println("\nx = " + x + " y = " + y + "\n");
    System.out.print("Success, the values have been swapped.");
  }
}