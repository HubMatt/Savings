package com.Savings;
import java.util.Scanner;
public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance, monthInterest;
    public double saver1, saver2;

    public void calculateMonthlyInterest() {
        monthInterest = ((savingsBalance * annualInterestRate) / 12);
        System.out.printf("The monthly interest is : %lf",monthInterest);
    }

    public void updateSavingsBalance() {
        savingsBalance = monthInterest + savingsBalance;
    }

    public static void modifyInterestRate() {
        Scanner scnr = new Scanner(System.in);
        annualInterestRate = 0.04;
    }

}