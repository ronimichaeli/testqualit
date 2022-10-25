package Ex8;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Person8 {
    String name;
    int age;
    private Address address;

    Person8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setAddress(String city, String[] phones) {
        this.address = new Address(city, phones);
    }

    Address getAddress() {
        return address;
    }

    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

}

