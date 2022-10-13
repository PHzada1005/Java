/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioarray1;

import java.util.Scanner;

/**
 *
 * @author uniepedreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int array[];
        
        array = new int[10];
        System.out.println("Digite dez números: ");
        for(int count=0; count< array.length;count++){
            
            array[count] = input.nextInt();       
        }
        int maior = array[0];
        for(int valor : array){
            System.out.printf("%5d\n", valor);
            if (valor>maior)
                maior = valor;
        }
        
        System.out.println("O maior número digitado é:  " + maior);
        
    }
    
}
