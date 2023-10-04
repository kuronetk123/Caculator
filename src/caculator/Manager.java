    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caculator;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class Manager extends Menu {

    public Manager(Scanner scanner) {
        super(scanner);
        
    }
    public int menu() {
        String[] options = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        int choice = getChoice("Main Menu", options);
        return choice;
    }

    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        printProperty("Number is odd:", checkOdd(a), checkOdd(b), checkOdd(x));
        printProperty("Number is even:", checkEven(a), checkEven(b), checkEven(x));
        printProperty("Number is perfect square:", checkSquareNumber(a), checkSquareNumber(b), checkSquareNumber(x));
    }

    public void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        printProperty("Number is odd:", checkOdd(a), checkOdd(b), checkOdd(c), checkOdd(x1), checkOdd(x2));
        printProperty("Number is even:", checkEven(a), checkEven(b), checkEven(c), checkEven(x1), checkEven(x2));
        printProperty("Number is perfect square:", checkSquareNumber(a), checkSquareNumber(b), checkSquareNumber(c), checkSquareNumber(x1), checkSquareNumber(x2));
    }

    private void printProperty(String label, boolean... properties) {
        System.out.print(label + " ");
        for (boolean property : properties) {
            if (property) {
                System.out.print("true ");
            } else {
                System.out.print("false ");
            }
        }
        System.out.println();
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}