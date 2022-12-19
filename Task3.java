public class Task3 {
    public static void main(String[] args) {
        int sec = 10000;
        int m = sec % 60;
        int min = (sec - m) / 60;
        int hours = min / 60;
        int days = hours / 24;
        int weeks = days / 7;
        System.out.println("секунд: " + sec);
        System.out.println("минут: " + min);
        System.out.println("часов: " + hours);
        System.out.println("дней: " + days);
        System.out.println("недель: " + weeks);


    }

}
