package Ex10;

public class Store {
    Toy[] toys;
    int amount;
    int size;

    Store(int size) {
        this.toys = new Toy[size];
        this.size = size;
        this.amount = 0;
    }
    Store(Toy[] toysArray) {
        this.toys = toysArray;
    }

    void addToy(Toy toy) {
        try {
            toys[amount] = toy;
            amount++;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.err.println("Store is full, No more toys can be added");
        }
    }

    void playAllToys() {
        for (Toy toy: this.toys) {
            toy.Play();
        }
    }
}
