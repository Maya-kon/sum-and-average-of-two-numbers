import java.util.Scanner;

public class JavaClass
{
public static void main(String[] args) 
{
 System.out.println("welcome to Java programming");
// create a Scanner to obtain input from the command window
Scanner input = new Scanner(System.in);
double number1, number2, sum;
System.out.print("Enter first number: "); // prompt
number1 = input.nextDouble(); // read 1st number from user
System.out.print("Enter second number: "); // prompt
number2 = input.nextDouble(); // read 2nd number from user
sum = number1 + number2;
double average = (double) sum / 2;
average=Math.round(average);
System.out.printf("sum is %.1f %n", sum);
System.out.printf("average is %.1f %n", average);
} // end main method
} // end class SumAverage
