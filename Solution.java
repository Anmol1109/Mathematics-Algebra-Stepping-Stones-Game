import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String solve(long n) {
        String s = "";
        double x = ((-1 + Math.pow((1 + 8 * n),0.5)) / 2.0);
        if (x == (int)x)
            s = "Go On Bob " + (int)x;
        else
            s = "Better Luck Next Time";
    // Write your code here
    return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());

            String result = Result.solve(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
