/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.StringAnalyzer;
import view.Menu;

/**
 *
 * @author tung
 */
public class Input {

    private final StringAnalyzer stringAnalyzer;
    public final Menu menu;

    public Input() {
        this.stringAnalyzer = new StringAnalyzer();
        this.menu = new Menu();
    }

    public void analyzeString(String inputString) {
        int numberOfCharacters = stringAnalyzer.getNumberOfCharacters(inputString);
        List<Integer> numbers = stringAnalyzer.getNumbers(inputString);
        List<Integer> evenNumbers = stringAnalyzer.getEvenNumbers(numbers);
        List<Integer> oddNumbers = stringAnalyzer.getOddNumbers(numbers);
        List<Integer> perfectSquareNumbers = stringAnalyzer.getPerfectSquareNumbers(numbers);
        String uppercaseCharacters = stringAnalyzer.getUppercaseCharacters(inputString);
        String lowercaseCharacters = stringAnalyzer.getLowercaseCharacters(inputString);
        String specialCharacters = stringAnalyzer.getSpecialCharacters(inputString);

        menu.displayAnalysisResults(inputString, numberOfCharacters, numbers,
                evenNumbers, oddNumbers, perfectSquareNumbers, uppercaseCharacters,
                lowercaseCharacters, specialCharacters);
    }

}