import java.util.InputMismatchException;
import java.util.Scanner;

public class Simon {
    private String color;
    public Simon() {
        //oidsafhdsalkjfdsaaaaaaaalkjsdfhlaksdjlfakjdshflkjdsalf
    }
    public String generateRandom() {
        String[]colors;
        colors = new String[4];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
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
    }
    public void go() {
        boolean shouldGo = true;
        Scanner scanner = new Scanner(System.in);
        while (shouldGo == true) {
            
        }
        
    }
    
    public void main(String args[]) {
        
    }
    
}
