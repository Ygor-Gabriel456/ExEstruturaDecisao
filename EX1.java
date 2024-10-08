package ExEstruturaDecisao;

import java.util.Scanner;

public class EX1 {
 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um numero inteiro");
        num = leia.nextInt();
        if(num%2==0){
            System.out.println("O numero é: " + num + "é par");
        }
        else{
            System.out.println("Este numero é ímpar!!!");
        }
    }
}
