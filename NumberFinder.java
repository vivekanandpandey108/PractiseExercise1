public class NumberFinder {
    public static String findNumber(int num, int input){
        if(num>input){
            return "Number guessed is more than original number";
        }
        else if(num<input) {
            return "Number guessed is less than original number";
        }
        return "Number guessed matches the original number";
    }
}