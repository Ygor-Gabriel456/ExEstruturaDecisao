
package ExEstruturaDecisao;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double num1, num2, num3, num4, media;
        
        System.out.println("Digite sua primera nota");
        num1 = leia.nextDouble();
        System.out.println("Digite sua segunda nota");
        num2 = leia.nextDouble();
        System.out.println("Digite sua terceira nota");
        num3 = leia.nextDouble();
        System.out.println("Digite sua quarta nota");
        num4 = leia.nextDouble();
        
        media = (num1+num2+num3+num4) / 4;
        
       
        if(media > 6){
                System.out.println("aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        
        
    }
}
