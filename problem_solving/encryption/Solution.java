import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {

        int length = s.length();
        int count = (int) Math.ceil(Math.sqrt(length));
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            int n = i;
            String encrypted = "";
            while (n < length) {
                encrypted = encrypted + s.charAt(n);
                n = n + count;
            }
            buffer.append(encrypted).append(" ");
        }

        return buffer.toString();
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
