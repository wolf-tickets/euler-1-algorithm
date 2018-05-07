import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for (long a0 = 0; a0 < t; a0++) {
            long n = in.nextInt();
            long q = n - 1;
            long x = q / 15;
            long w = (((105 * (x * (x + 1))) / 2) - (45 * x));
            long z = (q % 15);
            long v = 0;
            long u = 0;
            if (z != 0) {

                long a = (z / 5);
                long b = (z / 3);
                long r = q - z;

                v = a * r + (a * (a + 1) / 2) * 5;
                u = b * r + (b * (b + 1) / 2) * 3;


            }

            System.out.println(w + v + u);
        }

    }
}
     