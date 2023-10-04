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
abstract class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }


    public abstract void execute();

    public int getChoice(String title, String[] options) {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println(title);
        System.out.println("-----------------------------");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Choose 1 - " + options.length + ": ");

        String choice = scanner.nextLine();

        return Integer.parseInt(choice);
    }

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(scanner.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkOdd(double n) {
        return n % 2 == 1;
    }

    public boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public boolean checkSquareNumber(double n) {
        return Math.sqrt(n) % 1 == 0;
    }
}