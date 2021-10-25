/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

import javax.swing.JOptionPane;

public class Conta extends Usuario{
    private int Numero;
    private double Saldo;
    private String Extrato;
    private String Tipo;
    private double Limite;
    private double taxaJuros;

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }    
    
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }  

    public double getSaldo() {
        return Saldo;
    }

    public void setExtrato(String Extrato) {
        this.Extrato = Extrato;
    }

    public String getExtrato() {
        return Extrato;
    }

    public String getTipo() {
        return Tipo;
    }
    
    public boolean Aplica(double valor){
        if(valor >= 0){
            this.Saldo += valor;
            JOptionPane.showMessageDialog(null, "Valor aplicado!");
            setExtrato(Extrato + "+ " + valor + "     (Aplicação)\n");
            return true;
        }
        else JOptionPane.showMessageDialog(null, "Valor inválido!");
        return false;
    }
    
    public boolean Retira(double valor){
        if(valor >= 0){
            if(valor > this.Saldo){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                return false;
        }
            else{
                this.Saldo -= valor;
                JOptionPane.showMessageDialog(null, "Saque realizado!");
                setExtrato(Extrato + "- " + valor + "     (Retirada)\n");
            }    
            return true;
        }
        else JOptionPane.showMessageDialog(null, "Valor inválido!");    
        return false;
    }
}