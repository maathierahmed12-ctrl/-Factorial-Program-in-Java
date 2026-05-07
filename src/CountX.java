public class CountX {

    public int CountX(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + CountX(str.substring(1));
        }else
            return CountX(str.substring(1));
    }

    public class CountXDemo{
        public static void main (String[]args){

            CountX count = new CountX();

            System.out.println("countX(\"xxhixx\") = " + count.CountX("xxhixx"));
            System.out.println("countX(\"xhixhix\") = " + count.CountX("xhixhix"));
            System.out.println("countX(\"hi\") = " + count.CountX("hi"));
        }

    }
}
