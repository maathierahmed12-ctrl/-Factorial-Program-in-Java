public class CountAbc {

    public int CountAbc(String str){

        if(str.length()<3){
            return 0;
        }
        String firstThree = str.substring(0,3);
        if(firstThree.equals("abc") ||firstThree.equals("abc")){

            return 1 + CountAbc(str.substring(1));
        }
          return CountAbc(str.substring(1));
    }
    public class CountAbcDemo{

        public static void main(String[]args){

            CountAbc count = new CountAbc();

            System.out.println("countAbc(\"abc\") = "
                    + count.CountAbc("abc"));

            System.out.println("countAbc(\"abcxxabc\") = "
                    + count.CountAbc("abcxxabc"));

            System.out.println("countAbc(\"abaxxaba\") = "
                    + count.CountAbc("abaxxaba"));
        }
    }        }

