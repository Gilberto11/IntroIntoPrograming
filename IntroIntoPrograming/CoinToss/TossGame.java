import java.util.Scanner;


public class TossGame {
public static void main(String[]args){
    public static void coinFlip(Scanner input) {
    
    int countHeads = 0;
    int countTails = 0;
    double count = 0.0;
    double ratio = 0.0;
    String line = "";
    
    while(input.hasNextLine()) {
        countHeads = 0;
        countTails = 0;

        line = input.nextLine();
        StringTokenizer lineTokens = new StringTokenizer(line);
        while (lineTokens.hasMoreTokens()) {
            String token = lineTokens.nextToken();
            if (token.toLowerCase().equals("h")) {
                countHeads++;
            } else {
                countTails++;
            }
        }

        count = countTails + countHeads;

        ratio = Math.abs(1 - (countTails/count)) * 100;

        System.out.printf(countHeads + " heads (%1.1f%%)\n", ratio);

        if (countHeads > countTails) {
            System.out.println("You win!\n");
        }
        else {
            System.out.println();
        }
    }
}

}

}