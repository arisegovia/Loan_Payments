package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the interest rate: ");
        double interestRate = input.nextDouble();

        System.out.println("Please enter the number of years: ");
        double years = input.nextDouble();

        System.out.println("Please enter the loan amount: ");
        double loan = input.nextDouble();

        double monthlyRate = (interestRate/100)/12;

        double monthlyPayment = (loan * monthlyRate) / (1 - ((1) / (Math.pow(1 + monthlyRate, years * 12))));

        double totalPayment = monthlyPayment * (years * 12);

        DecimalFormat df = new DecimalFormat("$###.##");
        DecimalFormat df1 = new DecimalFormat("$###,###.##");

        System.out.println("Your monthly payment is " + df.format(monthlyPayment));
        System.out.println("Your total payment is " + df1.format(totalPayment));
    }
}
