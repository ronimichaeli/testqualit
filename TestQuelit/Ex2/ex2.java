package Ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {


buli();



    }

    public  static  void buli(){
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
      int n = sc.nextInt();



        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        System.out.print("Enter another number: ");
       int m = se.nextInt();

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++){

            System.out.println(array[i]);
        }

        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == m) {
                result = true;
            }
        }
        System.out.println("");
        System.out.println("The boolean value of the extra number is : " + result);
    }



    }




