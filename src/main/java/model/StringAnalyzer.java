/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tung
 */
public class StringAnalyzer {

    public int getNumberOfCharacters(String inputString) {
        return inputString.length();
    }

    public List<Integer> getNumbers(String inputString) {
        List<Integer> numbers = new ArrayList<>();
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }
        return numbers;
    }

    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public List<Integer> getPerfectSquareNumbers(List<Integer> numbers) {
        List<Integer> perfectSquareNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (isPerfectSquare(num)) {
                perfectSquareNumbers.add(num);
            }
        }
        return perfectSquareNumbers;
    }

    private boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public String getUppercaseCharacters(String inputString) {
        return inputString.replaceAll("[^A-Z]", "");
    }

    public String getLowercaseCharacters(String inputString) {
        return inputString.replaceAll("[^a-z]", "");
    }

    public String getSpecialCharacters(String inputString) {
        return inputString.replaceAll("[a-zA-Z0-9\\s]", "");
    }
}
