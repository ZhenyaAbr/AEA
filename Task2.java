public class Task2 {
    public static void main(String[] args) {
        int result = addSumToMultiplication(7, 11);
        System.out.println(result);

    }
    static int addSumToMultiplication(int a, int b) {
        int result = (a + b) + (a * b);
        return result;

    }
}
