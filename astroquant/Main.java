package com.astroquant;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to + or * or - or / or %? Don't forget to put in you number values. Ex. 2 + 2");
        System.out.println(" Enter operator");
        char op = sc.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.println(" Sure we can " + op);

            System.out.println("You entered operator  " + op);
            String str = sc.nextLine();
            System.out.println("go ahead and enter in your first value");
            int val = sc.nextInt();
            System.out.println("go ahead and enter in your second value");
            int valtwo = sc.nextInt();
            System.out.println("You entered values " + val + " and " + valtwo);
            System.out.println(" Awesome! Now lets take " + val + " and " + valtwo + " and " + op + " them ");
            if (op == '+') {
                int result = val + valtwo;
                System.out.println(result);
            }
            if (op == '-') {
                int result = val - valtwo;
                System.out.println(result);
            }
            if (op == '*') {
                int result = val * valtwo;
                System.out.println(result);
            }
            if (op == '/') {
                int result = val / valtwo;
                System.out.println(result);
            }
            if (op == '%') {
                int result = val % valtwo;
                System.out.println(result);
            }
        } else {
            System.out.println("ERROR : " + op + " Not supported");
        }

    }
}
