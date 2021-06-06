/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principle = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the rate of interest: ");
        String strInterest = in.nextLine();
        double interestRate = Double.parseDouble(strInterest) / 100;
        System.out.print("Enter the number of years: ");
        String strYears = in.nextLine();
        double years = Double.parseDouble(strYears);

        double investment = principle * (1 + interestRate * years);
        DecimalFormat answerFormat = new DecimalFormat("#.##");
        String strInvestment = answerFormat.format(investment);

        System.out.printf("After %s years at %s%%, the investment will be worth $%s.\n",
                           strYears, strInterest, strInvestment);
    }
}
