package exchain_of_responsibility;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        System.out.println("Escreva alguma frase: ");
        frase = teclado.nextLine();
        Processador process = new ProcessadorUm_Espacos();
        process.contarChar(frase);
    }
    
}
