
package my.contacteditor;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Gerente extends Usuario{
    private ArrayList<Cliente> Clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    
    public Cliente CadastraCliente(String Nome, String Senha){
        Cliente C = new Cliente();
        C.setNome(Nome);
        C.setSenha(Senha);
        C.setGerenteRelacionado(this.getNome());
        Clientes.add(C);
        return C;
    }
    
    public Gerente CadastraGerente(String Nome, String Senha){
        Gerente G = new Gerente();
        G.setNome(Nome);
        G.setSenha(Senha);
        return G;
    }
    
    
}
