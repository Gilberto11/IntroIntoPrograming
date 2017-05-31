import java.util.*;
public class ReverseTest{
    public static void main(String args[]) {
    String s, rev = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    s = in.nextLine();

    int length = s.length();
    // char[] cs=s.toCharArray();
    int l, r;
    int i = 0;
    while (i < length) {
        l = i; // starting index
        // find length of sub-block to reverse copy
        while (i < length && s.charAt(i) != ' ') { 
            i++;
        }
        r = i - 1; // ending index
        for (int j = r; j >= l; j--) { // copy reverse of sub-block
            rev = rev + s.charAt(j);
        }
        rev = rev + " "; // add the whitespace
        i++;
    }

    System.out.println("Reverse of entered string is: " + rev);
	}
}

