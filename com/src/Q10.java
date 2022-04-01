package src;

import java.io.IOException;

public class Q10 {
    public static void main (String[] args) throws IOException {
        String str = Utils.readCli("Enter any string to be reversed:");
        firstMethod(str);
        secondMethod(str);
    }

    /*
    Reverses the string in memory
    Pros: variable is persisted in memory
    Cons: slow, higher memory usage
     */
    public static void firstMethod(String str) {
        long start = System.nanoTime();

        for (int i = str.length()-1; i >= 0; i--) {
            str += str.charAt(i);
        }
        str = str.substring(str.length()/2);
        System.out.printf("First algorithm: %s", str);

        long end = System.nanoTime();
        System.out.printf(" (%f ms)%n", (end-start) / 1e6);
    }

    /*
    Reverses the string by printing it in reverse
    Pros: simple, fast
    Cons: string only reversed in the output buffer
     */
    public static void secondMethod(String str) {
        long start = System.nanoTime();

        System.out.print("Second algorithm: ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        long end = System.nanoTime();
        System.out.printf(" (%f ms)%n", (end-start) / 1e6);
    }
}
