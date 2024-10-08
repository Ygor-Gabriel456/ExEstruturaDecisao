package ExEstruturaDecisao;

import java.util.Scanner;

public class EX4ERRADO {
   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double m,f;
        
        System.out.println("Digite sua media");
        m = leia.nextDouble();
        System.out.println("Informe seu porcentual de frequencia");
        f = leia.nextDouble();
        
        if(f < 75){
            System.out.println("Reprovado por falta");
        }
        if(m < 6){
            System.out.println("Reprovado por nota");
        }
        else{
            System.out.println("Aprovado");
        }
        
        //ESTÁ ERRADO POR CAUSA DA UTILIZAÇÃO DE "SE"
    }
}
