import java.util.InputMismatchException;
import java.util.Scanner;

public class Simon {
    private String color;
    private String[] sqnc1;
    int a;
    public Simon() {
        //oidsafhdsalkjfdsaaaaaaaalkjsdfhlaksdjlfakjdshflkjdsalf
    }
    public String generateRandom() {
        String[]colors = {"red ","blue ","green ", "yellow "};
        int random = (int) (Math.random()*4);
        this.color = colors[random];
        return this.color;
    }
    public void generateRandomSequence() {
        String[]sqnc = new String[16];
        sqnc[0]= generateRandom();
        sqnc[1]= generateRandom();
        sqnc[2]= generateRandom();
        sqnc[3]= generateRandom();
        sqnc[4]= generateRandom();
        sqnc[5]= generateRandom();
        sqnc[6]= generateRandom();
        sqnc[7]= generateRandom();
        sqnc[8]= generateRandom();
        sqnc[9]= generateRandom();
        sqnc[10]= generateRandom();
        sqnc[11]= generateRandom();
        sqnc[12]= generateRandom();
        sqnc[13]= generateRandom();
        sqnc[14]= generateRandom();
        sqnc[15]= generateRandom();
        this.sqnc1 = sqnc;
    }
    public void go() {
        boolean shouldGo = true;
        Scanner input = new Scanner(System.in);
        while (shouldGo == true) {
            generateRandomSequence();
            for (int i = 0; i <= 15; i++) {
                System.out.println(sqnc1[i]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
