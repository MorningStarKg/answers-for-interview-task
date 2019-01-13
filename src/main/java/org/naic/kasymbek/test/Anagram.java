package org.naic.kasymbek.test;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) throws Exception {

        if (args.length<2) {
            System.out.println("it must be two arguments");
            throw new Exception();
        }
        if (args.length>2) {
            System.out.println("it must be two arguments ");
            throw new IllegalArgumentException();
        }
        System.out.println(isAnagram(args[0], args[1]));

    }
    public static boolean isAnagram(String value1, String value2) {
        value1 = value1.toLowerCase();
        value2 = value2.toLowerCase();
        char[] charArrayValue1=value1.toCharArray();
        char[] charArrayValue2=value2.toCharArray();
        Arrays.sort(charArrayValue1);
        Arrays.sort(charArrayValue2);
        return Arrays.equals(charArrayValue1, charArrayValue2);
    }
}
