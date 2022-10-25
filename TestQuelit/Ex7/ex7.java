package Ex7;
import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        person Igor = new person("Maor", 5);
        person Avi = new person("Noam", 2);
        person Lior = new person("Eliran", 33);

        ArrayList<person> personsList = new ArrayList<>();
        personsList.add(Igor);
        personsList.add(Avi);
        personsList.add(Lior);

        printPersonsNames(personsList);
    }

    static void printPersonsNames(ArrayList<person> list) {
        for (person person : list) {
            System.out.println(person.name);
        }
    }
}
