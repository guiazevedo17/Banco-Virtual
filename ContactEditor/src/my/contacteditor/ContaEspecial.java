/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ContaEspecial extends Conta{
    private double Limite;
    private String Tipo = "Especial";

    public String getTipo() {
        return Tipo;
    }

    public void setLimite(double Limite) {
        this.Limite = Limite;
    }

    public double getLimite() {
        return Limite;
    } 
    
    public boolean Retira(double valor){
        if(valor >= 0){
            if(valor > (getSaldo() + Limite)){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                return false;
            }
            
            else if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
                JOptionPane.showMessageDialog(null, "Saque realizado!");
            }         
            else{
                valor -= getSaldo();
                Limite -= valor;
                setSaldo(getSaldo() - valor);
                JOptionPane.showMessageDialog(null, "Saldo realizado! \nLimite restante R$ " + getLimite());
            }
            setExtrato(getExtrato() + "- " + valor + "     (Retirada)\n");
            return true;
        }
        else JOptionPane.showMessageDialog(null, "Valor inválido!");
        return false;
    }
    
}
