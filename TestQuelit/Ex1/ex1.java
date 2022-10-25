package Ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;


        System.out.println("enter your first srting : ");
        String a1 = s.nextLine();

        System.out.println("enter your second string : ");
        String a2 = s2.nextLine();

        System.out.println("enter your third string : ");
        String a3 = s3.nextLine();

        longerNam(a1,a2,a3);
    }
    public static void longerNam(String a1, String a2 ,String a3) {
        int n1 = a1.length();
        int n2 = a2.length();
        int n3 = a3.length();
        int n4 = (n1+n2+n3);
        System.out.println("");
        System.out.println("the conc is : " + n4);

    }
}
