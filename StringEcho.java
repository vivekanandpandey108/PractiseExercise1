public class StringEcho {
    public static String createEcho(String inputString, int n){

        int i = n;
        while(i>0) {
            inputString += inputString.substring(inputString.length() - n);
            i--;
        }
        return inputString;
    }
}