/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Computer Lab 3
 */
public class QuickSort {
    
    public static void quickSort(int[] numbers, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(numbers, low, high);

            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

 
    public static int partition(int[] numbers, int low, int high) {

        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (numbers[j] <= pivot) {
                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}
