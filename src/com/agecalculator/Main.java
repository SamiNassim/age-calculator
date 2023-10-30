package com.agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Enter your date of birth :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate inputDate = LocalDate.parse(input, formatter);
        Period period = Period.between(inputDate, now);
        System.out.println("Your age is " + period.getYears() + " years old, " + period.getMonths() + " months and " + period.getDays() + " days.");
    }
    }
