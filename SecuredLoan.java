package lendingManagementSystem;

import java.util.Scanner;

public class SecuredLoan extends Loan
{
    public double number1, number2,sum;

    public double get10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Loan Amount Asked : ");
        number1 = input.nextDouble();
        System.out.println("Enter the Property Value : ");
        number2 = input.nextDouble();
        sum = ( number2/ number1);

        System.out.println("Loan to value is: " + sum);

        if (sum <= .80) {
            System.out.println("loan passed");
        }
        else {
            System.out.println("loan rejected");

        }
        return sum;

    }
}

