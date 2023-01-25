import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimonGPT {

    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            int next = rand.nextInt(4);
            sequence.add(next);
            System.out.println("Watch the sequence:");

            for (int i = 0; i < sequence.size(); i++) {
                int button = sequence.get(i);
                System.out.print(button + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\b\b\b   \b\b\b");
            }

            System.out.println("\nEnter the sequence:");
            for (int i = 0; i < sequence.size(); i++) {
                int button = input.nextInt();
                if (button != sequence.get(i)) {
                    System.out.println("Incorrect! Game over.");
                    playing = false;
                    break;
                }
            }

            if (playing) {
                System.out.println("Correct! Next round.");
            }
        }

        input.close();
    }
}