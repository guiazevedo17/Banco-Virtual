/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

/**
 *
 * @author Usuario
 */
public class ContaPoupanca extends Conta{
    private double TaxaDeJuros;
    private String Tipo = "Poupanca";

    public void setTaxaDeJuros(double TaxaDeJuros) {
        this.TaxaDeJuros = TaxaDeJuros;
    }

    public String getTipo() {
        return Tipo;
    }  
    
}
