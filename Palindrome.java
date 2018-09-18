import java.util.Scanner;

public class Palindrome {

    public static String checkPalindrome(int z)
    {
        int r,sum=0,temp,t=0;
        temp=z;
        String str;
        while(z>0)
        {
            r=z%10;
            sum=(sum*10)+r;
            z=z/10;
            if(r%10==0)
                t=t+r;

        }
        if(temp==sum)
        {
            if (t > 25)
                str = "the given number is palindrome and the sum of even numbers is greater than 25";
            else
                str = "the given number is palindrome and the sum of even numbers is less than 25";
        }
        else
            str = "the given number is not palindrome";
        return str;
    }
}

