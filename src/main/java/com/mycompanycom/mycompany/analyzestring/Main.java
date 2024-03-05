/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompanycom.mycompany.analyzestring;

import controller.Input;



/**
 *
 * @author tung
 */
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        String inputString = input.menu.getUserInput();
        input.analyzeString(inputString);
    }
}