public class SumDigits {

    public int sumDigits(int n) {

        if (n == 0) {

            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }
    public class SumDigitsDemo {

        public static void main(String[] args) {

            SumDigits obj = new SumDigits();

            System.out.println("sumDigits(126) = " + obj.sumDigits(126));

            System.out.println("sumDigits(49) = " + obj.sumDigits(49));

            System.out.println("sumDigits(12) = " + obj.sumDigits(12));
        }
    }
}
