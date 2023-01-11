import java.util.InputMismatchException;
import java.util.Scanner;

public class Simon {
    private String color;
    public Simon() {
        //oidsafhdsalkjfdsaaaaaaaalkjsdfhlaksdjlfakjdshflkjdsalf
    }
    public void generateRandom() {
        String[]colors;
        colors = new String[4];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
        int random = (int) (Math.random()*4);
        System.out.println(colors[random]);
        this.color = colors[random];
    }
    public void go() {
        boolean shouldGo = true;
        while (shouldGo == true) {
            
        }
        
    }
    
    public void main(String args[]) {
        
    }
    
}
