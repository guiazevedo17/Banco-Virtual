public class cEspecial extends Conta {
    //private boolean permissaoSaque;
    private float saque;
    private float saldoAposSaque;
    
    public float getSaque() {
        return saque;
    }

    public void setSaque (float saque) {
        this.saque = saque;
    }
    
    public float getSaldoAposSaque() {
        return saldoAposSaque;
    }

    public void setSaldoAposSaque (float saldoAposSaque) {
        this.saldoAposSaque = saldoAposSaque;
        this.saldoAposSaque = saldo - saque;
    }

    public void Saque() {
        if(saldoAposSaque <= 0 && saldoAposSaque < limite) {
            System.out.printf("Saque Permitido !");
        }
    }
}
