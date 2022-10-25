package Ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        untilTwenty();

    }

    public static void untilTwenty(){
        Scanner s = new Scanner(System.in);
        int result = 0;
        while (result <= 20) {
            System.out.println("Enter number: ");
            int num = s.nextInt();
            result = result + num;
            s.nextLine();
        }
        System.out.println(result + " exceeded 20");

    }
}
