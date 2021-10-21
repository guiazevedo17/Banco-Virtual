public class Conta {
    
    int numConta;
    String nomeCorrentista;
    float saldo;
    float limite;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta (int num) {
        numConta = num;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista (String nome) {
        nomeCorrentista = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo (float num) {
        saldo = num;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite (float num) {
        limite = num;
    }

    void imprimeVariaveis() {
        System.out.printf("\nNúmero da Conta : "+numConta);
        System.out.printf("\nNome Correntista : "+nomeCorrentista);
        System.out.printf("\nSaldo : "+saldo);
        System.out.printf("\nLimite: "+limite);
        System.out.printf("\n\n");
    }
}