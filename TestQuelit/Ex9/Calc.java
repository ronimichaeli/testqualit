package Ex9;

public class Calc {
    private int X;
    private int Y;


    public void setX(int x) {
        if (x > 0) {
            X = x;
        } else {
            System.out.println("Number must be bigger than 0");
        }
    }
    int getX() {
        return X;
    }

    public void setY(int y) {
        if (y > 0) {
            Y = y;
        } else {
            System.out.println("Number must be bigger than 0");
        }
    }

    public int getY() {
        return Y;
    }

    void Add() {
        System.out.println("Sum of the numbers is: " + (this.X + this.Y));
    }

    void Mul() {
        System.out.println("Multiply of the numbers is: " + this.X * this.Y);
    }

    void printBigger() {
        if (X > Y) {
            System.out.println("The bigger number is : " + X);
        } else if (Y > X) {
            System.out.println("The bigger number is : " + Y);
        } else {
            System.out.println("Numbers are even");
        }
    }
}
