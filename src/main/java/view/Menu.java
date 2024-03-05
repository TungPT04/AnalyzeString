/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tung
 */
public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public void displayAnalysisResults(String inputString, int numberOfCharacters,
            List<Integer> numbers, List<Integer> evenNumbers,
            List<Integer> oddNumbers, List<Integer> perfectSquareNumbers,
            String uppercaseCharacters, String lowercaseCharacters,
            String specialCharacters) {
        System.out.println("===== Analysis String program =====");
        System.out.println("Input String: " + inputString);
        System.out.println("-----Result Analysis------");
        System.out.println("Number of characters in the string: " + numberOfCharacters);
        System.out.println("All Characters: " + inputString);
        System.out.println("Uppercase Characters: " + uppercaseCharacters);
        System.out.println("Lowercase Characters: " + lowercaseCharacters);
        System.out.println("All Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Perfect Square Numbers: " + perfectSquareNumbers);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
