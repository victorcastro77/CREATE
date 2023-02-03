import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Simon {
    private static String color;
    int random = (int) (Math.random()*4);
    static String[] sqnc = new String[16];
    private void generateRandom() {
        String[]colors = new String[4];
        colors[0] = "r";
        colors[1] = "b";
        colors[2] = "g";
        colors[3] = "y";
        int random = (int) (Math.random()*4);
        this.color = colors[random];
    }

    public static void main(String[] args) {
        ArrayList<Integer> sqnc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int next = rand.nextInt(4);
        boolean go = true;
        while (go) {
            System.out.println("Match the pattern: ");
            System.out.println(color);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.print('\u000C');
            for (int i = 0; i < sqnc.size(); i++) {
                if (input.equals(color)) {
                    System.out.println("Correct!");
                }
                if (!input.equals(color)) {
                    go = false;
                }
            }
            System.out.print('\u000C');
        }
    }
}
