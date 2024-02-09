package org.example;

public class Converter {
    private static final String[] ROMAN_NUMERALS = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private static final int[] VALUES = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public static String convertArabicToRoman(int number){
        if (number < 1 || number > 3999999) {
            throw new IllegalArgumentException("Input out of range");
        }

        StringBuilder roman = new StringBuilder();
        int i = ROMAN_NUMERALS.length - 1;

        while (number > 0) {
            int quotient = number / VALUES[i];
            number %= VALUES[i];
            while (quotient-- > 0) {
                roman.append(ROMAN_NUMERALS[i]);
            }
            i--;
        }
        return roman.toString();
    }
}