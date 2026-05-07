public class ChangePi {
    public String changePi(String str){

        if((str.length() == 0));

        return "";
    }
    if(str.startswith("pi"){
        return 3.14 + changePi(str.substring(2));

        char firstChar = str.charAt(0);

        return firstChar + changePi(str.substring(1));
    }
    public class ChangePiDemo{
        public static void main(String[]args){

            ChangePi pi = new ChangePi();

            System.out.println("changePi(\"xpix\") = " + pi.changePi("xpix"));
            System.out.println("changePi(\"pipi\") = " + pi.changePi("pipi"));
            System.out.println("ChangePi (\" pip \") = " + pi.changePi("pip"));

        }
    }
}