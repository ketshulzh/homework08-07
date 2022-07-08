package Homework08_07;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void fillRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (rand.nextDouble() * 100);
        }
    }

    static void printArray (int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //array18-22
        //Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение
        //первого из тех его элементов A[K], которые удовлетворяют неравенству
        //A[K] < A[10]. Если таких элементов нет, то вывести 0.
        /*
        int [] arr = new int [10];
        fillRandom(arr);
        printArray(arr);
        for (int i = 0; i < 10; i++){
            if(arr[i] < arr[9]){
                System.out.print(arr[i] + " "); //забыла, как делать так, чтобы печаталось только первое, а не все
            }
            else {
                System.out.println(0);
            }
        }
        */
        //Array19. Дан целочисленный массив A размера 10. Вывести порядковый номер
        //последнего из тех его элементов AK, которые удовлетворяют двойному
        //неравенству A[1] < A[K] < A[10]. Если таких элементов нет, то вывести 0.
        /*
        int [] arr = new int [10];
        fillRandom(arr);
        printArray(arr);
        for (int i = 0; i < 10; i++){
            if(arr[i] > arr[1] && arr[i] < arr[9]){
                System.out.print(i + " "); //кажется, что-то тут не работает
            }
            else {
                System.out.println(0);
            }
        }
*/
//Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
//сумму элементов массива с номерами от K до L включительно.
/*
       Scanner in = new Scanner (System.in);
       int N = in.nextInt();
        int K = in.nextInt();
        int L = in.nextInt();
        int arr [] = new int [N];
        int sum = 0;
        fillRandom(arr);
        printArray(arr);
        for (int i = 0; i < N; i++) {
            if (i >= K && i <= L) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
*/
        //Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L
        //включительно.
        /*
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int L = in.nextInt();
        int arr [] = new int [N];
        double sum = 0;
        double k = 0;
        fillRandom(arr);
        printArray(arr);
        for (int i = 0; i < N; i++) {
            if (i >= K && i <= L) {
                sum += arr[i];
                k++;
            }
        }
        System.out.println(sum/k);
        */

        //Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
        //сумму всех элементов массива, кроме элементов с номерами от K до L
        //включительно.
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int L = in.nextInt();
        int arr [] = new int [N];
        int sum = 0;
        fillRandom(arr);
        printArray(arr);
        for (int i = 0; i < N; i++) {
            if (i <= K || i >= L) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}


