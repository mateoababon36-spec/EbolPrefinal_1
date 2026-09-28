/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Computer Lab 3
 */
public class TestMerge {
    public static void main(String[] args) {

        int[] numbers = {38, 12, 27, 43, 9, 31, 18, 10, 25};

        // Sorted numbers
        int[] sortedNumbers = {9, 10, 12, 18, 25, 27, 31, 38, 43};

        System.out.println("Sorted Array:");
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }

        boolean sorted = true;

        for (int i = 0; i < sortedNumbers.length - 1; i++) {
            if (sortedNumbers[i] > sortedNumbers[i + 1]) {
                sorted = false;
                break;
            }
        }
}
}