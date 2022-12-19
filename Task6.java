public class Task6 {
    public static void main(String[] args) {

            int min = 0;
            int a = Math.abs(-9);
            int b = Math.abs(11);
            int c = Math.abs(-13);

            if (a < b && a < c)
                min = a;
            else if (b < a && b < c)
                min = b;
            else if (c < a && c < b)
                min = c;
        System.out.println(min);

    }
}
