import java.util.Scanner;

public class VowelConsonent {


    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);
        String text = n.nextLine();
        String str = VowelConsonentCheck(text);
        System.out.print(str);
    }


    public static String VowelConsonentCheck(String text)
        {
        int l = text.length();
        int k=0;
        String str = "";


            for (int i = 0; i < l; i++)
            {
                if(i!=0)
                    str = str + " ";
                int j = 0;
                char ch = text.charAt(i);
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        j++;
                }
                if (j == 1)
                    str = str + "Vowel";
                else
                    str = str + "Consonent";
            }
        return str;
    }
}
