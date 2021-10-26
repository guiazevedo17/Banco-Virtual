/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private String GerenteRelacionado;
    private ArrayList<Conta> Contas = new ArrayList<>();
    
    public void setGerenteRelacionado(String GerenteRelacionado) {
        this.GerenteRelacionado = GerenteRelacionado;
    }

    public String getGerenteRelacionado() {
        return GerenteRelacionado;
    }

    public ArrayList<Conta> getContas() {
        return Contas;
    }   
       
    public void cadastraContaSimples(String Nome, int nro){
        ContaSimples CS = new ContaSimples();
        CS.setExtrato("");
        CS.setSaldo(0);
        Contas.add(CS);
        CS.setNumero(nro);       
        
    }
    
    public void cadastraContaEspecial(String Nome, int nro){
        ContaEspecial CE = new ContaEspecial();
        CE.setExtrato("");
        CE.setSaldo(0);
        Contas.add(CE);
        CE.setNumero(nro);     
    }
    
    public void cadastraContaPoupanca(String Nome, int nro){
        ContaPoupanca CP = new ContaPoupanca();
        CP.setExtrato("");
        CP.setSaldo(0);
        Contas.add(CP);
        CP.setNumero(nro);      
    }           
}
