package enttities;

public class CP extends Conta {

    private String nome;
    private int rg;

    public CP() {
    }

    public CP(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public void tipoDeConta(String tipo) {
        if (("CP".equals(tipo)) || ("cp".equals(tipo))) {
            this.setTipoConta("Conta Corrente");

            System.out.println("Tipo de Conta: " + this.getTipoConta());
            System.out.println("Nº Agencia: " + this.getnAgencia());
            System.out.println("Nº Conta: " + this.getnConta());
            System.out.println("Nº Ditito: " + this.getnDigito());
            System.out.println("Nome: " + this.getNome());
            System.out.println("Rg: " + this.getRg());

        }

    }

    @Override
    public void extrato() {

        System.out.println("---------------- Extrato Completo -----------------");
        System.out.println();
        System.out.println("Nome: " + this.getNome());
        informacoes();
        extratoDeposito();
        extratoSaque();
        System.out.println("Saldo: " + this.getSaldo());

    }

}
