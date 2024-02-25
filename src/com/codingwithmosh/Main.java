package com.codingwithmosh;

public class Main {

    public static void main(String[] args) {
        int principle = (int) Console.readNumber("Principle: ", 1, 5_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principle, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}