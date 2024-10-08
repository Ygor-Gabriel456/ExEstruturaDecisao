
package ExEstruturaDecisao;

import java.util.Scanner;

public class EX2 {
   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade");
        idade = leia.nextInt();
        
        if(idade >=18){
            System.out.println("Voce e maior de idade");
        }
        else{
            System.out.println("Voce e de menor");
        }
    }
}
