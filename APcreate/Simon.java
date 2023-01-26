import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Simon {
    private String color;
    ArrayList<String> sqnc = new ArrayList<>();
    public Simon() {
        //oidsafhdsalkjfdsaaaaaaaalkjsdfhlaksdjlfakjdshflkjdsalf
    }

    private String generateRandom() {
        String[]colors = {"red ","blue ","green ","yellow "};
        int random = (int) (Math.random()*4);
        this.color = colors[random];
        return this.color;
    }

    public void generateRandomSequence() {
        ArrayList<String> sqnc1 = new ArrayList<>(Arrays.asList(generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom(),generateRandom()));
        sqnc = sqnc1;
    }

    public void go() {
        boolean shouldGo = true;
        Scanner input = new Scanner(System.in);
        while (shouldGo) {
            for (int i = 0; i < sqnc.size(); i++) {
                int a = sqnc.get(i);
                System.out.print(a + " ");
            }
            System.out.println("/nMatch the pattern:");
            for (int i = 0; i < sqnc.size(); i++) {
                int button = input.nextInt();
                if (button != a) {
                    System.out.println("Incorrect! Game over.");
                    shouldGo = false;
                    break;
                }
            }
        }


    }
}
