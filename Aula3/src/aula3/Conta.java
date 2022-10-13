/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author uniepedreis
 */
public class Conta {
    private int num;
    private String nome;
    private double saldo;
    
    public Conta(int num, double saldo, String nome){
        this.num = num; 
        this.saldo = saldo;
        this.nome = nome ;
        
    }
    public String toString(){
        return "Titular da conta: "+ nome + "\nNúmero da conta: " + num +"\nSaldo: " + saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
        
    }
    public int getNum(){
        return num;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }
}
