/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Computer Lab 3
 */
public class TestInsertionSort {
    public class InsertionSortTest {

    public static void main(String[] args) {

        int[] numbers = {38, 12, 27, 43, 9, 31, 18, 10, 25};

        InsertionSort sort = new InsertionSort(numbers);

        System.out.println("Original Array:");
        sort.display();

        System.out.println("\n\nSorting:");
        sort.sort();

        System.out.println("\nFinal Sorted Array:");
        sort.display();

        boolean sorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }

     
}
    }
}
