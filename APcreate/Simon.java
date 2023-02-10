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
            for (int i = 0; i < sqnc.size(); i++) {
                int button = sqnc.get(i);
                System.out.print(button + " ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\b\b\b   \b\b\b");
            }
            System.out.print('\u000C');
            System.out.println("Enter the sequence:");
            for (int i = 0; i < sqnc.size(); i++) {
                int button = input.nextInt();
                if (button != sqnc.get(i)) {
                    System.out.println("Incorrect! Game over.");
                    go = false;
                    break;
                }
            }

            if (go) {
                System.out.println("Correct! Next round.");
            }
        }
    }
}
