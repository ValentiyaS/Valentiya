package java_idea;

public class main_for {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Count is: " + i);
        }
        int j = 10;
        for (; j < 10; j--) {
            System.out.println("Time left: " + j);
        }
        for (int m = 0, n = 10; m < n; m++, n--) {
            System.out.println(m + "&" + n);

        }
    }
}
