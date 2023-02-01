import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Simon {
    private String color;
    String[] sqnc = new String[16];

    private String generateRandom() {
        String[]colors = {"red ","blue ","green ","yellow "};
        int random = (int) (Math.random()*4);
        this.color = colors[random];
        return this.color;
    }

    public String[] generateRandomSequence() {
        sqnc[0] = generateRandom();
        sqnc[1] = generateRandom();
        sqnc[2] = generateRandom();
        sqnc[3] = generateRandom();
        sqnc[4] = generateRandom();
        sqnc[5] = generateRandom();
        sqnc[6] = generateRandom();
        sqnc[7] = generateRandom();
        sqnc[8] = generateRandom();
        sqnc[9] = generateRandom();
        sqnc[10] = generateRandom();
        sqnc[11] = generateRandom();
        sqnc[12] = generateRandom();
        sqnc[13] = generateRandom();
        sqnc[14] = generateRandom();
        sqnc[15] = generateRandom();
        return sqnc;
    }

    public void main(String[] args) {
        boolean shouldGo = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Match the sequence:");
        while (shouldGo == true) {
                System.out.println(sqnc[]);
                System.out.println("Match the pattern: ");
                if (!input.equals(sqnc[])) {
                    shouldGo = false;
                } else if (input.equals(sqnc[spot])) {
                    System.out.println("Correct!");
                    System.out.println(sqnc[spot+1]);
                }
                System.out.println("/u000C");
        }
    }
}
