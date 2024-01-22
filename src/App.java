import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dois numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0){
                System.out.println("PRIMEIRO");
            } else if (x < 0 && y > 0){
                System.out.println("SEGUNDO");
            } else if (x < 0 && y < 0){
                System.out.println("TERCEIRO");
            } else {
                System.out.println("QUARTO");
            }
            
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
