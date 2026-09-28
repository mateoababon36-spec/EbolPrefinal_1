/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

public class TestSelectionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 1, 8, 7, 2, 3, 6, 5, 4};

        System.out.println("Original numbers:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");

        SelectionSort.SelectionSort(numbers);

        System.out.println("\nSorted numbers:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
