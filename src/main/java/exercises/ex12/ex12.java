package exercises.ex12;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex12 example12 = new ex12();

        String principalNum = example12.principalInput();
        String interestNum = example12.interestInput();
        String yearsNum = example12.yearsInput();

        //Conversion
        int principal = example12.intPrinc(principalNum);
        double interest = example12.doubInter(interestNum);
        int years = example12.intYear(yearsNum);

        double worth = example12.worthCal(principal, interest, years);
        int roundingFormat = example12.roundingFormat(worth);
        //Output
        String outputString = example12.outputString(worth, interest, years, roundingFormat);

        example12.printOutput(outputString);
    }

    private int roundingFormat(double worth) {
        if(worth % 1 == 0)
        {
            int worthInt = (int) worth;
            System.out.println(worthInt);
            return worthInt;
        }
        return 1;
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private double worthCal(int principal, double interest, int years) {
        double inter = interest/100;
        double worthCalc = principal + inter * years * principal;
        return worthCalc;
    }

    private String outputString(double worthCal, double interest, int years, int roundingFormat) {
        if(roundingFormat == 1)
            return "After "+ years + " years at " + interest +"%, the investment will be worth $" + worthCal + ".";
        else
            return"After "+ years + " years at " + interest +"%, the investment will be worth $" + roundingFormat + ".";
    }

    private int intYear(String yearsNum) {
        int intYear = Integer.parseInt(yearsNum);
        return intYear;
    }

    private double doubInter(String interestNum) {
        double doubInter = Double.parseDouble(interestNum);
        return doubInter;
    }

    private int intPrinc(String principalNum) {
        int IntPrinc = Integer.parseInt(principalNum);
        return IntPrinc;
    }

    private String yearsInput() {
        System.out.print("Enter the number of years: ");
        String interYears = in.nextLine();
        return interYears;
    }

    private String interestInput() {
        System.out.print("Enter the rate of interest: ");
        String interInput = in.nextLine();
        return interInput;
    }

    private String principalInput() {
        System.out.print("Enter the principal: ");
        String princInput = in.nextLine();
        return princInput;
    }
}
