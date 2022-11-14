//ajava  that asks the user to enter the year and check whether the year
package leapyear;
//importing scanner input.
import java.util.Scanner;
import java.util.Scanner;
public class Leapyear {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the year");
      int year = (int) input.nextDouble();
      boolean flag = false;
      if (year% 400==0)
      {
          flag = true;
      }
      else if (year% 100==0)
      {
          flag = false;
      }
      else flag= year% 4==0;
      if(flag){
          System.out.println("Year" + year + " is a leap year ");
      }
      else
      {
          System.out.println("Year" + year + " is not a leap year ");
      }
    }
    
}