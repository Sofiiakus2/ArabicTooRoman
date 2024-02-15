package org.example;/*
  @author   Sofiia
  @project   ArabicTooRoman
  @class  ConverterToRoman
  @version  1.0.0 
  @since 15.02.2024 - 19.32
*/

import java.util.HashMap;
import java.util.Map;

public class ConverterToRoman {
    public static int romanToInteger(String s){
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Введено пустий рядок");
        }

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (!romanMap.containsKey(currentChar)) {
                throw new IllegalArgumentException("Введені не правильні літери");
            }
            int currentValue = romanMap.get(currentChar);
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }
}
