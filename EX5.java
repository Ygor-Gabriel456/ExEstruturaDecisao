
package ExEstruturaDecisao;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double imc, altura, peso;
        
        System.out.println("Digite seu peso");
        peso = leia.nextDouble();
        System.out.println("Digite a sua altura");
        altura = leia.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("Seu imce é: " + imc);
        
        
        if(imc < 20){
            System.out.println("Abaixo do peso");
        }else if(imc < 25 ){
            System.out.println("Peso normal");
        }else if(imc < 30){
            System.out.println("Sobrepeso");
        }else if(imc < 40){
            System.out.println("Obeso");
        }
        else{
            System.out.println("Obeso Mórbido");
        }
    }
}
