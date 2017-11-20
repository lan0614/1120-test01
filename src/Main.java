import java.util.*;
public class Main {
//**排列
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, j, i;
        x = in.nextInt();
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
