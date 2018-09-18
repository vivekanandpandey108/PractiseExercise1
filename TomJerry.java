import java.util.Scanner;
public class TomJerry {

    public static String check(int r)
    {
        String ch="\0";
        if ((r >= 20) && (r <= 30))
        {
            if (r % 2 != 0)
                ch = "Tom";
            else
                ch = "Jerry";
        }
        return ch;
    }

}
