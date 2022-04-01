package src;

import java.io.IOException;

public class Q9 {
    public static void main (String[] args) throws IOException {
        String str = Utils.readCli("Enter any string to count length:");
        System.out.println(str.getBytes().length);
    }
}
