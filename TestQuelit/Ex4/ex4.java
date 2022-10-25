package Ex4;

public class ex4 {
    public static void main(String[] args) {
        int[][] multiIntArr = {{4, 5, 2}, {7, 8, 1}, {1, 0, 6}};
        secondinnerarr(multiIntArr, 1);
    }
    public static void secondinnerarr(int[][] arr, int firstDimensionIndex){
        int result = 0;
        for (int i = firstDimensionIndex; i < firstDimensionIndex + 1; i++) {
            for (int j = 0; j < arr[firstDimensionIndex].length; j++) {
                result += arr[i][j];
            }
        }
        System.out.println("Sum is: " + result);
    }
}
