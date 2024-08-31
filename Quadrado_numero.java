package quadrado_numero;
import java.util.Scanner;



/**
 *
 * @author autologon
 */
public class Quadrado_numero {
    public static void main(String[] args) {
            int q;
            
            System.out.println("Digite um número inteiro");
            Scanner leia = new Scanner(System.in);
            int n = leia.nextInt();
            q = n * n;
            System.out.println("O resultado do número: " + n + " ao quadrado é:" + q);
                    }
          
    
}
