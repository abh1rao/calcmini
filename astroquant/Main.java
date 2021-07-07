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
            System.out.println("go ahead and enter in your first value");
            int val = sc.nextInt();
            System.out.println("go ahead and enter in your second value");
            int val2 = sc.nextInt();
            System.out.println("You entered values " + val + " and " + val2);
            System.out.println(" Awesome! Now lets take " + val + " and " + val2 + " and " + op + " them ");
            int result=0;
            if (op == '+') {
                 result = val + val2 ;
            }
            if (op == '-') {
                 result = val - val2;
            }
            if (op == '*') {
                 result = val * val2;
            }
            if (op == '/') {
                 result = val / val2;
            }
            if (op == '%') {
                 result = val % val2;
            }
            System.out.println(result);
        } else {
            System.out.println("ERROR : " + op + " Not supported");
        }

    }
}
