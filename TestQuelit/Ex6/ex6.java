package Ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size number of the array");
        n =sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int lar1=arr[0];
        int lar2=arr[1];


        if(lar1<lar2)
        {
            int temp=lar1;
            lar1=lar2;
            lar2=temp;
        }

        for(int i=2;i<n;i++)
        {
            if (arr[i] > lar1)
            {
                lar2 = lar1;
                lar1 = arr[i];
            }
            else if (arr[i] > lar2 && arr[i] != lar1)
            {
                lar2 = arr[i];
            }
        }
        System.out.println("First Largest number : " + lar1);
        System.out.println("Second Largest number : " + lar2);


    }

    }




