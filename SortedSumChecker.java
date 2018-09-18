import java. util. Arrays;
import java.lang.Math;

public class SortedSumChecker {
    public static int sortNum(int inputNum) {

        String s = Integer.toString(inputNum);
        int l = s.length();
        int[] digitArray = new int[l];

        for (int i = 0; i < l; i++) {
            digitArray[i] = inputNum % 10;
            inputNum = inputNum / 10;
        }

        Arrays.sort(digitArray);
        int outputNum = 0;

        for (int i = 0; i < l; i++) {
            outputNum += digitArray[i]*Math.pow(10,l-1-i);
        }
        return outputNum;
    }

    public static boolean checkSum(int inputNum){
        String s = Integer.toString(inputNum);
        int l = s.length();
        int[] digitArray = new int[l];

        for (int i = 0; i < l; i++) {
            digitArray[i] = inputNum % 10;
            inputNum = inputNum / 10;
        }

        int sum=0;

        for(int i=0;i<l;i++){
            if(isEven(digitArray[i])){
                sum=sum+digitArray[i];
            }
        }

        if(sum>15) {
            return true;
        }
        return false;
    }

    public static boolean isEven(int num){
        if(num%2 == 0) {
            return true;
        }
        return false;
    }
}