public class cPoupanca extends Conta {
    private int rendimento;
    private float juros;

    public int getRendimento() {
        return rendimento; 
    }

    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros (float juros) {
        this.juros = juros;
    }
    
    public void negativo() {
        if(saldo < 0) {
            System.out.printf("\nNão Permitido !");
            //this.statusSaldo = 1;
        }
    }
}