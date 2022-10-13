/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

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
        int array[]= {15,12,5,2,25,3,90,53,36,20};
        
        System.out.println("Index Valor");
        
        for(int count : array){
            System.out.printf("%5d\n", count);
        }
    }
    
}
