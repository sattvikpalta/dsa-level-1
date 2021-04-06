package bas.getstarted;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.close();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n + ": Prime");
            } else {
                System.out.println(n + ": Not Prime");
            }
        }
    }
}