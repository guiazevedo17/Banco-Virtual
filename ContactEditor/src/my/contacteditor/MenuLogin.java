package my.contacteditor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MenuLogin extends javax.swing.JFrame{
    private static ArrayList<Gerente> ListaUsuarios = new ArrayList<>();
    private boolean PrimeiroAcesso = true;
    
    public MenuLogin(ArrayList<Gerente> Lista, boolean segundoacesso) {
        initComponents();
        ListaUsuarios = Lista;
        PrimeiroAcesso = segundoacesso;
        
        if(PrimeiroAcesso)registraAdmin();
        //teste();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextNome = new javax.swing.JLabel();
        TextSenha = new javax.swing.JLabel();
        ButtonAcesso = new javax.swing.JButton();
        CampoSenha = new javax.swing.JPasswordField();
        CampoNome = new javax.swing.JTextField();
        Banco = new javax.swing.JLabel();
        TextInsira = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TextNome.setText("Nome:");

        TextSenha.setText("Senha:");

        ButtonAcesso.setText("Acessar");
        ButtonAcesso.setToolTipText("");
        ButtonAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAcessoActionPerformed(evt);
            }
        });

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        Banco.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        Banco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/banco.png"))); // NOI18N
        Banco.setText("Banco Paradigmas");

        TextInsira.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextInsira.setText("Seja bem vindo(a). Insira seus dados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextNome)
                            .addComponent(TextSenha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoSenha)
                            .addComponent(CampoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAcesso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextInsira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(Banco)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(TextInsira))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Banco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSenha)
                    .addComponent(ButtonAcesso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed

    }//GEN-LAST:event_CampoNomeActionPerformed

    private void ButtonAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAcessoActionPerformed
        String NomeInserido = CampoNome.getText();
        String SenhaInserida = new String(CampoSenha.getPassword());
        verificaLogin(NomeInserido, SenhaInserida);       
    }//GEN-LAST:event_ButtonAcessoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLogin(ListaUsuarios, true).setVisible(true);
            }
        });
    }
    
    /*public void teste(){
        for(int i=0;i<ListaUsuarios.size(); i++)
                        {
                            System.out.println("Gerente: " + ListaUsuarios.get(i).getNome());
                            for(int j=0; j<ListaUsuarios.get(i).getClientes().size(); j++){
                                System.out.println("  Cliente: " + ListaUsuarios.get(i).getClientes().get(j).getNome());  
                                for(int k=0; k<ListaUsuarios.get(i).getClientes().get(j).getContas().size(); k++){
                                    System.out.println("    Nro Conta: " + ListaUsuarios.get(i).getClientes().get(j).getContas().get(k).getNumero());
                                }
                            }
                        }
    }*/
    
    public void registraAdmin(){
        try{
            FileWriter ArquivoContas = new FileWriter("D:\\Usuario\\Documents\\PUC-Campinas\\4 semestre\\Paradigmas B\\Projeto/contas.txt", false);
            PrintWriter PW = new PrintWriter(ArquivoContas);
            PW.println("Gerente");
            PW.println("Admin");
            PW.println("123");
            PW.flush();
            PW.close();
            ArquivoContas.close();
            
            Gerente Admin = new Gerente();
            Admin.setNome("Admin");
            Admin.setSenha("123");
            ListaUsuarios.add(Admin);
            PrimeiroAcesso = false;
        }
        catch(IOException Ex)
        {
            Ex.printStackTrace(); 
        }       
    }
       
    public boolean verificaLogin(String Nome, String Senha){
        if(Nome.isEmpty() && Senha.isEmpty())JOptionPane.showMessageDialog(null, "Campos vazios!");
        else if(Nome.isEmpty())JOptionPane.showMessageDialog(null, "Nome n??o inserido");
        else if(Senha.isEmpty())JOptionPane.showMessageDialog(null, "Senha n??o inserida");
        else{
            try{
                File ArquivoContas = new File("D:\\Usuario\\Documents\\PUC-Campinas\\4 semestre\\Paradigmas B\\Projeto/contas.txt");
                Scanner LeContas = new Scanner(ArquivoContas);
                while(LeContas.hasNextLine())
                {                             
                    String TipoCadastrado = LeContas.nextLine();
                    String NomeCadastrado = LeContas.nextLine();
                    String SenhaCadastrada = LeContas.nextLine();
                    
                    if(Nome.equals(NomeCadastrado) && Senha.equals(SenhaCadastrada))
                    {
                        for(int i=0;i<ListaUsuarios.size(); i++)
                        {
                            if(ListaUsuarios.get(i).getNome().equals(Nome) && ListaUsuarios.get(i).getSenha().equals(Senha))
                            {
                                JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n\t" + ListaUsuarios.get(i).getNome());
                                new MenuGerencia(ListaUsuarios, i).setVisible(true);
                                setVisible(false);
                                dispose();
                                return true;
                            }
                                                      
                            for(int j=0; j<ListaUsuarios.get(i).getClientes().size(); j++){
                                if(ListaUsuarios.get(i).getClientes().get(j).getNome().equals(Nome)
                                && ListaUsuarios.get(i).getClientes().get(j).getSenha().equals(Senha))
                                {
                                    JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)\n\t" + ListaUsuarios.get(i).getClientes().get(j).getNome());
                                    new MenuCliente(ListaUsuarios, i, j).setVisible(true);
                                    setVisible(false);
                                    dispose();
                                    return true;
                                }                                 
                            }
                        }                                                                                        
                    }
                }                   
            }            
            catch(IOException Ex)
            {
               Ex.printStackTrace();          
            }
        }
        CampoNome.setText("");
        CampoSenha.setText("");
        JOptionPane.showMessageDialog(null, "Seja incorreta, ou usu??rio inv??lido");
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banco;
    private javax.swing.JButton ButtonAcesso;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel TextInsira;
    private javax.swing.JLabel TextNome;
    private javax.swing.JLabel TextSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
