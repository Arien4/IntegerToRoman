package practice;

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII,
// which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral
// for four is not IIII. Instead, the number four is written as IV. Because the one is before
// the five we subtract it making four. The same principle applies to the number nine, which is written as IX.
// There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given an integer, convert it to a roman numeral.

// Example 1:
// Input: num = 3
// Output: "III"
// Explanation: 3 is represented as 3 ones.
// Example 2:
// Input: num = 58
// Output: "LVIII"
// Explanation: L = 50, V = 5, III = 3.
// Example 3:
// Input: num = 1994
// Output: "MCMXCIV"
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// Constraints:
// 1 <= num <= 3999

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(intToRoman(9));
    }

    public static String intToRoman(int num) {
//        Map<Integer, String> roman = Map.ofEntries(
//                Map.entry(1000, "M"),
//                Map.entry(900, "CM"),
//                Map.entry(500, "D"),
//                Map.entry(400, "CD"),
//                Map.entry(100, "C"),
//                Map.entry(90, "XC"),
//                Map.entry(50, "L"),
//                Map.entry(40, "XL"),
//                Map.entry(10, "X"),
//                Map.entry(9, "IX"),
//                Map.entry(5, "V"),
//                Map.entry(4, "IV"),
//                Map.entry(1, "I"));
        // Does not preserve order
        Map<Integer, String> roman = new LinkedHashMap<>();
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");

        StringBuilder result = new StringBuilder();
        for (int key : roman.keySet()) {
            while (num >= key) {
                num -= key;
                result.append(roman.get(key));
            }
        }
        return result.toString();
    }
}
