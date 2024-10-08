package ExEstruturaDecisao;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int opc;
        int Diaria;
        
        
        System.out.println("Boa noite, selecione as opcoes de quartos");
        System.out.println("\n-Simples\n2Duplo\n3Triplo\n4-sair");
        opc = leia.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Seu quarto e o simples");
                System.out.println("O valor da diaria e RS255,50");
                System.out.println("-----------------------------");
                System.out.println("Quantas diarias voce gostaria");
                Diaria = leia.nextInt();
                double totalDiaria = 255.50 * Diaria;
                System.out.println("O total da sua diaria é: " + totalDiaria);
             break;
             
            case 2:
                System.out.println("Seu quarto e o duplo");
                System.out.println("O valor da diaria e RS305,50");
                System.out.println("-----------------------------");
                System.out.println("Quantas diarias voce gostaria");
                int Diaria2 = leia.nextInt();
                double total = 305.50 * Diaria2;
                System.out.println("O total da sua diaria e: " + total);
                break;
                
            case 3:
               System.out.println("Seu quarto e o duplo");
                System.out.println("O valor da diaria e RS360,50");
                System.out.println("-----------------------------");
                System.out.println("Quantas diarias voce gostaria");
                int Diaria3 = leia.nextInt();
                double totaHospeda = 360.50 * Diaria3;
                System.out.println("O total da sua diaria e: " + totaHospeda);
                break;
            default:
                System.out.println("Essa hospedagem nao existe");
                
                
        }
    }
}
