public class RandomInputSum {
    public static int findSum(int[] inputArray){
        int sum = 0;
        for(int i =0;i<inputArray.length;i++){
            sum += inputArray[i];
        }
        return sum;
    }
}