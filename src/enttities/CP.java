package enttities;

import java.util.ArrayList;

public class CP extends Conta {

    private String nome;
    private int rg;

    protected ArrayList<Double> listaD = new ArrayList<>();
    protected ArrayList<Double> listaS = new ArrayList<>();
    protected ArrayList<Double> listaT = new ArrayList<>();

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
            this.setTipoConta("Conta Poupanca");
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
        this.setTipoConta("Conta Poupança");
        System.out.println("Tipo de Conta: " + this.getTipoConta());
        System.out.println("Nome: " + this.getNome());
        informacoes();
        extratoDeposito();
        extratoSaque();
        System.out.println("Saldo: " + this.getSaldo() + " Tranferencia");
        System.out.println("");

        System.out.println("data do extrato: " + tempo.format(calend.getTime()));

    }

    @Override
    public void saque() {
        this.saldo = (getSaldo() - this.saque);
        Double usuario = getSaque();
        listaS.add(usuario);
    }

    @Override
    public void extratoSaque() {

        listaS.forEach((extSaque) -> {
            System.out.println(" - " + extSaque + " (s)");
        });

        listaT.forEach((extrT) -> {
            System.out.println(" - " + extrT + " (t)");
        });

    }

    @Override
    public void Deposito() {
        this.saldo = (getSaldo() + this.deposito);
        Double usuario = getDeposito();
        listaD.add(usuario);
    }

    @Override
    public void extratoDeposito() {
        listaD.forEach((extDeposito) -> {
            System.out.println(" + " + extDeposito + " (d)");
        });
    }

    @Override
    public void transferencia() {
        if (getSaldo() > 0) {
            this.saldo = (this.getSaldo() - this.getTransferencia());
            Double usuario = getTransferencia();
            listaT.add(usuario);
            System.out.println("Transferencia efetuada com sucesso! " + this.getTransferencia());

        } else {
            System.out.println("Saldo insuficiente! ");
            this.getSaldo();
        }

    }

    @Override
    public void informacoes() {
        System.out.println("Nº Agencia: " + this.getnAgencia());
        System.out.print("Nº Conta: " + this.getnConta());
        System.out.println(" Nº Ditito: " + this.getnDigito());
    }

    @Override
    public void limite() {

    }

}
