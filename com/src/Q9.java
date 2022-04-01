package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter any string:");
        String str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        System.out.println(str.getBytes().length);
    }
}
