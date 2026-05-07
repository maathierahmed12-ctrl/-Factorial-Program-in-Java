public class BunnyEars {

    public int BunnyEars2(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {

            return 3 + BunnyEars2(n - 1);
        }
    else{



        return 2 + BunnyEars2(n - 1);
    }}

    public class BunnyEarsDemo{

        public static void main(String[]args){

            BunnyEars Bunny = new BunnyEars();

            System.out.println("BunnyEars2 0 =" + Bunny.BunnyEars2(0));
            System.out.println("BunnyEars2 1="+ Bunny.BunnyEars2(1));
            System.out.println("BunnyEars2 2 =" + Bunny.BunnyEars2(2));

        }

        }
}
