package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static String readCli(String message) throws IOException {
        System.out.println(message);
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
