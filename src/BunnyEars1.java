public class BunnyEars1 {

    public int BunnyEars1(int n){

        if(n==0){
            return 0;
        }
        return 2 + BunnyEars1(n - 1);
    }

    public class BunnyEarsDemo{

        public static void main(String[]args){

            BunnyEars Bunny = new BunnyEars();
            System.out.println("BunnyEars 0 =" + Bunny.BunnyEars2(0));
            System.out.println("BunnyEars 1 =" + Bunny.BunnyEars2(1));
            System.out.println("BunnyEars 2 =" + Bunny.BunnyEars2(2));

        }
    }

}
