package Ex8;

public class Address {
    String city;
    String[] phones;
    int numOfPhones;

    Address(String city, String[] phones) {
        this.city = city;
        this.phones = phones;
        this.numOfPhones = phones.length;
    }
}
