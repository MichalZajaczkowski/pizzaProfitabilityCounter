package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        profitabilityCounterPizza();

    }
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private static void profitabilityCounterPizza() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz pole pizzy: ");
        double polePizzy = scanner.nextDouble();
        System.out.print("Wpisz cene pizzy ");
        int cenaPizzy = scanner.nextInt();

        double ratioPizza = (polePizzy / cenaPizzy);

        if (ratioPizza < 0.8) {
            System.out.println("pizza nieopłacalna: " + df2.format(ratioPizza));
        } else if ((ratioPizza >= 0.8) && (ratioPizza < 1)) {
            System.out.println("pizza tak sobie opłacalna: " + df2.format(ratioPizza));
        } else if ((ratioPizza >= 1) && (ratioPizza < 1.2)) {
            System.out.println("pizza opłacalna: " + df2.format(ratioPizza));
        } else {  //(ratioPizza >= 1.2)
            System.out.println("pizza super opłacalna: " + df2.format(ratioPizza));
        }
    }
}
