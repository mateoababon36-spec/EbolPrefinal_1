/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sorting;

public class SelectionSort {

    public static void SelectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            // Find the smallest number
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

            // Show the process
            System.out.print("Pass " + (i + 1) + ": ");

            for (int number : numbers) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}

