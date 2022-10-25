package Ex10;
import java.util.ArrayList;
public class Toy {
    private int Price;
    private String Color;

    Toy(String color, int price) {
        // Price is more than 0 validation
        if (price > 0) {
            this.Price = price;
        } else if (price == 0){
            System.err.println("The price is 0, please update price again");
            this.Price = price;
        } else {
            throw new ArithmeticException("Price must be more than 0");
        }

        // Color is available validation
        ArrayList<String> availableColors = generateColorsList();
        color = color.toLowerCase();
        if (availableColors.contains(color)) {
            this.Color = color;
        } else {
            throw new IllegalArgumentException("This color is unavailable");
        }
    }

    int getPrice() {
        return this.Price;
    }

    String getColor() {
        return Color;
    }

    static ArrayList generateColorsList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("white");
        colors.add("black");
        colors.add("yellow");
        colors.add("orange");
        colors.add("red");
        colors.add("grey");
        colors.add("green");
        colors.add("pink");
        colors.add("purple");
        colors.add("brown");
        colors.add("gold");
        colors.add("silver");


        return colors;
    }

    void Play() {
        System.out.println("Playing with the " + this.getClass().getSimpleName());
    }

    void Buy() {
        System.out.println("Buying the " + this.getClass().getSimpleName());
    }
}
