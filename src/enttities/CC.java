package enttities;

public class CC extends Conta {

    private String nome;
    private int rg;

    public CC() {
    }

    public CC(String nome, int rg) {
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
        tipo = getTipoConta();
        if (("CC".equals(tipo)) || ("cc".equals(tipo))) {
            this.setTipoConta("Conta Corrente");
            System.out.println("Tipo de Conta: " + this.getTipoConta());
            System.out.println("Nome: " + this.getNome());

        }
    }

    @Override
    public void extrato() {

        System.out.println("---------------- Extrato Completo -----------------");
        System.out.println();
        this.setTipoConta("Conta Corrente");
        System.out.println("Tipo de Conta: " + this.getTipoConta());
        System.out.println("Nome: " + this.getNome());
        informacoes();
        extratoDeposito();
        extratoSaque();
        System.out.println("Saldo: " + this.getSaldo() + " Tranferencia");
        System.out.println("");

        System.out.println("data do extrato: " + tempo.format(calend.getTime()));

    }

}
