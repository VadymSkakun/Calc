import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        try {
            System.out.println("Input first integer:");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Input second integer:");
            b = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Please, input int data!");
            return;
        } catch (IOException e) {
            System.out.println("Please, input correct data!");
        }

        String sign = null;
        try {
            System.out.println("Input correct sign:");
            sign = reader.readLine();
        } catch (IOException e1) {
            System.out.println("Please, input correct sign!");
        }

        try {
            reader.close();
        } catch (IOException e1) {
        }

        Operations.count(a, sign, b);
    }
}