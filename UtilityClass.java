package com.saptakdas.util;

import java.util.Scanner;

/**
 * This class contains utility functions.
 * @author Saptak Das
 */
public class UtilityClass {
    /**
     * Get input from user.
     * @param text Input prompt
     * @return String returned.
     */
    public static String input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }
}
