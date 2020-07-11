package chapter2;//package declaration

import java.util.Scanner;

public class GrossPayCalculator {//class declaration

    public static void main(String arg[]){

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);//declared the scanner to receive input from Java
        int hours = scanner.nextInt();//to receive the input, reads in a whole number

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();//to receive the input, reads in a double. We will use this to get the pay rate.
        scanner.close();//after we read the input, we close this scanner to let Java know we're done with it and that they can free up that memory space.

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);


    }
}
