/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5;
import java.util.ArrayList;

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
        // PARTE 1
//        ArrayList<Integer> array = new ArrayList<>();
//        
//        array.add(10);
//        array.add(20);
//        array.add(30);
//        
//        for(int index=0; index<array.size(); index++){
//            System.out.println(array.get(index));
//        }

        // PARTE 3 - Exemplo 1
// Faça um algoritmos que armazene 10 números inteiros informados pelo
// usuário em um arrayList. Exiba como saída o MAIOR número desse array
//        ArrayList<Integer> array = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Digite dez números: ");
//
//        for(int count=0; count<10;count++){
//            int valor  = input.nextInt(); 
//            array.add(valor);
//        }
//        
//        int maior = array.get(0);
//        
//        for(int valor : array){
//            if (valor>maior)
//                maior = valor;
//        }
//         System.out.println("O maior número digitado é:  " + maior);
//         
//          Scanner input = new Scanner(System.in);
//          
//          ArrayList<Pessoa> p = new ArrayList<>();
//          
//          p.add(new Pessoa("Dani",21));
//          p.add(new Pessoa("Pedro",20));
//          p.add(new Pessoa("Nicole",19));
//         
//          for(int i=0;i<p.size(); i++){
//              System.out.println(p.get(i));
//          }
//         
//         
//         p.get(0).setNome("Flora");
//         for(int i=0;i<p.size(); i++){
//              System.out.println(p.get(i));
//          }
//         
            ArrayList<Pessoa> p = new ArrayList<>();
            ArrayList<Pessoa> p_copia = new ArrayList<>();
            
            p.add(new Pessoa("André",20));
            p.add(new Pessoa("Pedro",20));
            p.add(new Pessoa("Tato",20));
         
           
         
         
       }
    
}
