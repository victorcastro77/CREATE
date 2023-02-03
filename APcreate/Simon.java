import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Simon {
    private String color;
    String[] sqnc = new String[16];
    private void generateRandom() {
        String[]colors = new String[4];
        colors[0] = "r";
        colors[1] = "b";
        colors[2] = "g";
        colors[3] = "y";
        int random = (int) (Math.random()*4);
        this.color = colors[random];
    }
    public void generateRandomSequence() {
        sqnc[0] = color;
        sqnc[1] = color;
        sqnc[2] = color;
        sqnc[3] = color;
        sqnc[4] = color;
        sqnc[5] = color;
        sqnc[6] = color;
        sqnc[8] = color;
        sqnc[7] = color;
        sqnc[9] = color;
        sqnc[10] = color;
        sqnc[11] = color;
        sqnc[12] = color;
        sqnc[13] = color;
        sqnc[14] = color;
        sqnc[15] = color;
        System.out.println(sqnc);
    }

    public void main(String[] args) {
        boolean shouldGo = true;
        Scanner input = new Scanner(System.in);
        while (shouldGo == true) {
                System.out.println("");
                System.out.println("Match the pattern: ");
                System.out.println("/u000C");
                if (input.equals("r") && (sqnc[0] == "r")) {
                    System.out.println("Correct!");
                    
                }
                if (!input.equals(color)) {
                    shouldGo = false;
                }
        }
    }
}
