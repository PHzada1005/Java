/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioarray2;
import java.util.Random;

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
        Random rand = new Random();
        int m[][];
        
        m = new int[4][3];
        
        int maior = m[0][0];
        
        for(int i=0; i< m.length;i++){
            for(int j=0; j<m[i].length;j++){
               m[i][j] = rand.nextInt(1000);
         
            }
            
        }
        for(int i=0; i< m.length;i++){
            System.out.println("");
            for(int j=0; j<m[i].length;j++){
                System.out.printf("%5d", m[i][j]);
                 if (m[i][j]>maior)
                    maior= m[i][j];
               
            }
        }
        
        System.out.println("\n O maior número digitado é:  " + maior);
    }
    
}
