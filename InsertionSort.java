/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Computer Lab 3
 */
public class InsertionSort {
    int [] numbers;
    
    public InsertionSort (int []numbers) {
        this.numbers = numbers;
    }
    
    public void sort() {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i-1;
            System.out.println("Temp: " + temp);
            System.out.printf("Comparing: %d, and %d", numbers[j], temp);
            while (j >= 0 && numbers[j] > temp) {
                numbers[j+1] = numbers[j];
                j--;
                if (j != -1){
                System.out.printf("Comparing: %d and %d\n", numbers[j], temp);
            }
            }
            System.out.printf("%d Inserted at index ",temp, j+1);
            numbers[j+1] = temp;
            showSortedArray(i);
        }
    }
 public void showSortedArray(int index) {
     for (int i = 0; i <= index; i++) {
         System.out.print(numbers[i] + "");
     }
     System.out.println();
 }
 
public void display(){
    for (int number : numbers) {
        System.out.print(" " + number);
    }
}

    void Sort() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}