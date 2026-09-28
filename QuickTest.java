/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Computer Lab 3
 */
 public class QuickTest {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 8, 9, 1, 5};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        boolean sorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("\n\nTest Result:");

        if (sorted) {
            System.out.println("Array is correctly sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static void quickSort(int[] numbers, int low, int high) {

        if (low < high) {

            int pivot = partition(numbers, low, high);

            quickSort(numbers, low, pivot - 1);
            quickSort(numbers, pivot + 1, high);
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