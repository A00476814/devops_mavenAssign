package com.smu.mscda;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("This Program will capitalize the input string and Generate MD5 hex");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input String:");
        String input = scanner.nextLine();

        String output = getCapitalize(input);
        String md5Hex = getMd5Hex(output);
        System.out.println("Capitalized String is: " + output);
        System.out.println("MD5 hex for the capitalized string is: " + md5Hex);

    }

    public static String getMd5Hex(String output) {
        return DigestUtils.md5Hex(output);
    }

    public static String getCapitalize(String input) {
        return StringUtils.capitalize(input);
    }
}