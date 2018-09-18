public class StringReverser {
    public static String reverseString(String inputString)
    {
        int n = inputString.length();
        int i = n-1;
        String outputString = "";
        while(i>=0)
        {
            outputString  += Character.toString(inputString.charAt(i));
            i--;
        }
        return outputString;
    }
}