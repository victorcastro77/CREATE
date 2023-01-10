import java.util.InputMismatchException;
import java.util.Scanner;

public class Simon {
    private String red;
    private String blue;
    private String green;
    private String yellow;
    int color;
    public Simon() {
        //oidsafhdsalkjfdsaaaaaaaalkjsdfhlaksdjlfakjdshflkjdsalf
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean ongoing = true;
        while (ongoing == true) {
            System.out.print("Press spacebar to start...");
            try {
                color= scanner.next();
                
            } catch (InputMismatchException error) {
                
            }
        }
    }
    
    public void main(String[]args) {
        
    }
}
