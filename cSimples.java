public class cSimples extends Conta {
    //private boolean statusSaldo = 0;
    
    public void negativo() {
        if(saldo < 0) {
            System.out.printf("\nNão Permitido !");
            //this.statusSaldo = 1;
        }
    }
}