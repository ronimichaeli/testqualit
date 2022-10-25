package Ex5;

public class ex5 {
    public static void main(String[] args) {
        String[] namesArr = new String[6];
        namesArr[0] = "Roni";
        namesArr[1] = "Maor";
        namesArr[2] = "Noam";
        namesArr[3] = "Eliran";
        namesArr[4] = "Nethanel";
        namesArr[5] = "Kostantin";
        stringsLengthFromArray(namesArr);
    }
    public static void stringLength(String str){
        if (str != null) {
            System.out.println(str + " length is: " + str.length());
        } else {
            System.out.println("String is null");

        }
    }

    static void stringsLengthFromArray(String[] arr) {
        for (String s: arr) {
            stringLength(s);
        }
    }
}
