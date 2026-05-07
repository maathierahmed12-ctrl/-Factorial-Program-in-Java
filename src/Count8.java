public class Count8 {

    public int Count8(int n) {

        if (n == 0) {
            return 0;

            int lastDigit = n % 10;

            int prevDigit = (n / 10) % 10;

            if (lastDigit == 8 && prevDigit == 8) {
                return 2 + Count8(n / 10);
            }
            if (lastDigit == 8) {
                return 1 + Count8(n / 10);
            }
            return Count8(n / 10);
        }

           public class Count8Demo {

            public static void main(String[] args) {

                Count8 counter = new Count8();

                System.out.println("count8(8) = " + counter.Count8(8));

                System.out.println("count8(818) = " + counter.Count8(818));

                System.out.println("count8(8818) = " + counter.Count8(8818));
            }
        }
    }
}



