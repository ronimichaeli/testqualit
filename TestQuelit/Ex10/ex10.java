package Ex10;

public class ex10 {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Green",52);
        Toy toy2 = new Toy("Red", 23);
        Ball tennis = new Ball("Yellow", 0);
        tennis.setMaterial("green ball");
        tennis.setRadius(3);

        Store store1 = new Store(2);
        store1.addToy(toy1);
        store1.addToy(tennis);
        store1.addToy(toy2);

        store1.playAllToys();




    }
    }

