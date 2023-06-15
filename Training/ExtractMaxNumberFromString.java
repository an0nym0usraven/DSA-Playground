package Training;
import java.util.Scanner;

public class ExtractMaxNumberFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count=0, rem=0, digit=0;

        for(char ch: str.toCharArray())
        {
            int ascii = (int) ch;
            if (ascii > 60)
            {
                count=0;
                continue;
            }
            
            if(ascii<58 && ascii>47)
            {
                digit = ascii-48;
                count = count*10 + digit;
            }
            rem = Math.max(count, rem);
            
        }
        System.out.println(rem);
        sc.close();
    }
}
