package Ex10;

import java.util.ArrayList;

public class Ball extends Toy {
    private int Radius;
    private String Material;

    Ball(String color, int price) {
        super(color, price);
    }

    void setMaterial(String material) {
        // Material is in available materials list
        ArrayList<String> availableMaterials = generateMaterialList();
        material = material.toLowerCase();
        if (availableMaterials.contains(material)) {
            this.Material = material;
        } else {
            throw new IllegalArgumentException("No such Material");
        }
    }

    public String getMaterial() {
        return this.Material;
    }

    public void setRadius(int radius) {
        // Radius is more than 0 validation
        if (radius > 0) {
            this.Radius = radius;
        } else {
            throw new ArithmeticException("Radius can not be 0 or less");
        }
    }

    public int getRadius() {
        return this.Radius;
    }

    static ArrayList generateMaterialList() {
        ArrayList<String> availableMaterials = new ArrayList<>();
        availableMaterials.add("silicon");
        availableMaterials.add("plastic");
        availableMaterials.add("leather");
        availableMaterials.add("rubber");
        availableMaterials.add("green ball");

        return availableMaterials;
    }


}
