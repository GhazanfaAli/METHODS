// ==> Write a Java method to print the multiplication table of a number n.

public class Main {
    static void tabel(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(n+" X "+i+" = "+n*i);
          //  System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        tabel(10);

        }
    }
