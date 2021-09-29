package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User input
        Scanner input = new Scanner(System.in);

        //System output asking for interest rate and storing the input into a variable
        System.out.println("Please enter the interest rate: ");
        double interestRate = input.nextDouble();

        //System output asking for the number of years and storing the input into a variable
        System.out.println("Please enter the number of years: ");
        double years = input.nextDouble();

        //System output asking for the loan amount and storing the input into a variable
        System.out.println("Please enter the loan amount: ");
        double loan = input.nextDouble();

        //Calculation for monthly rate
        double monthlyRate = (interestRate/100)/12;

        //Calculation for monthly payments
        double monthlyPayment = (loan * monthlyRate) / (1 - ((1) / (Math.pow(1 + monthlyRate, years * 12))));

        //Calculation for total payment
        double totalPayment = monthlyPayment * (years * 12);

        //Formatting decimals
        DecimalFormat df = new DecimalFormat("$###.##");
        DecimalFormat df1 = new DecimalFormat("$###,###.##");

        //System output to print results
        System.out.println("Your monthly payment is " + df.format(monthlyPayment));
        System.out.println("Your total payment is " + df1.format(totalPayment));
    }
}
