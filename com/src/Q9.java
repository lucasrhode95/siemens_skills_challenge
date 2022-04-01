package src;

import java.io.IOException;

public class Q9 {
    public static void main (String[] args) throws IOException {
        String str = Utils.readCli("Enter any string:");
        System.out.println(str.getBytes().length);
    }
}
