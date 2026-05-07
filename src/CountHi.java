public class CountHi {

    public String CountHi (String str){

        if(str.length()<2){
            return 0;

        }
        if(str.substring(0,2).equals("hi")){

            return 1 + CountHi(str.substring(2));
        }
        return CountHi(str.substring(1));
    }
    public class CountHiDemo{

        public static void main(String[]main){

            CountHi hi = new CountHi();

            System.out.println("CountHi (\"xxhixx\") =" + hi.CountHi("xxhixx"));
            System.out.println("CountHi (\"xhixhix\") =" + hi.CountHi("hi"));
        }
    }
}
