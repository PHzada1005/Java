/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author uniepedreis
 */
public class Pessoa {
        private String nome;
        private int idade;
        
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public String getNome(){
            return nome;
        }
        public int getIdade(){
            return idade;
        }
        public String setNome(String nome){
            return this.nome = nome;
            
        }
    
        public int setIdade(int idade){
            return this.idade=idade;
       
        }
        public String toString(){
            return "Nome: "+ nome + "\nIdade: "+ idade; 
        }
}
