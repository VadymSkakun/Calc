public class Operations {
    static double result;

    public static void count(int a, String sign, int b) {
        try {
            if (a <= -1000 || a >= 1000)
                throw new RangeException(a + " is not in range! Try again.");
        } catch (RangeException e) {
            System.out.println(e.range);
            return;
        }

        try {
            if (!sign.equals("/") && !sign.equals("*") && !sign.equals("+") && !sign.equals("-")) {
                throw new SignException("Error! '" + sign + "' - is error sign!");
            }
        } catch (SignException e) {
            System.out.println(e.siEx);
            return;
        }

        try {
            if (b <= -1000 || b >= 1000) {
                throw new RangeException(b + " is not in range! Try again.");
            }
        } catch (RangeException e) {
            System.out.println(e.range);
            return;
        }

        if (sign.equals("/")) {
            try {
                result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ups... Division by zero!");
            }
        }

        if (sign.equals("*")) {
            result = a * b;
            System.out.println("Result: " + result);
        }

        if (sign.equals("+")) {
            result = a + b;
            System.out.println("Result: " + result);
        }

        if (sign.equals("-")) {
            result = a - b;
            System.out.println("Result: " + result);
        }
    }
}