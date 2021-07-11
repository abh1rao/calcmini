package com.astroquant;

import java.util.Arrays;

public class Arguments {
    public static void main(String[] args) {
        char op = args[0].charAt(0);
        int val = Integer.parseInt(args[1]);
        int val2 = Integer.parseInt(args[2]);
        System.out.println(Arrays.toString(args));
        System.out.println(Integer.parseInt((args[1])));
        System.out.println(Integer.parseInt((args[2])));
        System.out.println(args[0].charAt(0));

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
}
