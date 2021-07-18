package com.astroquant;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            char op;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Would you like to + or * or - or / or %? Don't forget to put in you number values. Ex. 2 + 2");
                System.out.println(" Enter operator");
                 op = sc.next().charAt(0);
                switch (op) {
                    case 'Q', 'q' -> {
                        System.out.println("CODE QUIT");
                        if (op == 'q')
                            op ='Q';
                        break;
                    }
                    case '+', '-', '*', '/', '%' -> {
                        System.out.println(" Sure we can " + op);
                        System.out.println("You entered operator  " + op);
                        System.out.println("go ahead and enter in your first value");
                        int val = sc.nextInt();
                        System.out.println("go ahead and enter in your second value");
                        int val2 = sc.nextInt();
                        System.out.println("You entered values " + val + " and " + val2);
                        System.out.println(" Awesome! Now lets take " + val + " and " + val2 + " and " + op + " them ");
                        int result = switch (op) {
                            case '-' -> val - val2;
                            case '+' -> val + val2;
                            case '/' -> val / val2;
                            case '%' -> val % val2;
                            case '*' -> val * val2;
                            default -> 0;
                        };
                        System.out.println(result);
                    }
                    case 'S', 'T', 'C' -> {
                        if (op == 's')
                            op = 'S';
                        if (op == 't')
                            op = 'T';
                        if (op == 'c')
                            op = 'C';
                        System.out.println(" Sure we can " + op);
                        System.out.println("You entered operator  " + op);
                        System.out.println("go ahead and enter in your first value in degrees");
                        double val = sc.nextDouble();
                        double radians = Math.toRadians(val);
                        double result = switch (op) {
                            case 'S' -> Math.sin(radians);
                            case 'T' -> Math.tan(radians);
                            case 'C' -> Math.cos(radians);
                            default -> 0;
                        };
                        System.out.println(result);
                    }

                    default -> System.out.println("ERROR : " + op + " Not supported");
                }
            } while (op != 'Q');
    }
}



