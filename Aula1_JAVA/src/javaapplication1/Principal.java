/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author uniepedreis
 */
import java.util.Scanner;
        
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
    
        
        System.out.print( "Insira a média do aluno: ");
        int média = input.nextInt();
        
        if (média>=5 && média<11)
            System.out.printf("Aluno aprovado ");
        else if (média<5 && média>=0)
            System.out.printf("Aluno está de P3 ");
        else 
            System.out.printf("Valor de média inválido ");
        
      
               
    }
    
}
