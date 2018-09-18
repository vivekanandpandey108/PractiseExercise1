public class PatternPrinter {
    public static String printPattern(int n)
    {
        String outputString = "";

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                outputString += Integer.toString(i);
            }
        }
        return outputString;
    }
}