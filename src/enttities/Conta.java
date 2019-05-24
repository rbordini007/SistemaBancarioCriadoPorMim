package enttities;

import java.util.ArrayList;

public class Conta extends Banco {

    protected int contagemDep;
    protected int contagemSaque;
    protected int contagemTrans;
    protected Double usuario;
    ArrayList<Double> lista = new ArrayList<>();
    ArrayList<Double> listaD = new ArrayList<>();
    ArrayList<Double> listaS = new ArrayList<>();

    public int getContagemDep() {
        return contagemDep;
    }

    public void setContagemDep(int contagemDep) {
        this.contagemDep = contagemDep;
    }

    public int getContagemSaque() {
        return contagemSaque;
    }

    public void setContagemSaque(int contagemSaque) {
        this.contagemSaque = contagemSaque;
    }

    public int getContagemTrans() {
        return contagemTrans;
    }

    public void setContagemTrans(int contagemTrans) {
        this.contagemTrans = contagemTrans;
    }

    @Override
    public void saque() {
        this.saldo = (getSaldo() - this.saque);
        this.contagemSaque = +1;// conta a quantidade de transação
        for (int i = 0; i < this.contagemSaque; i++) {
            usuario = getSaque();
            listaS.add(usuario);
        }

    }

    public void extratoSaque() {
        System.out.println("extrato saque: ");
        listaS.forEach((extSaque) -> {
            System.out.println(" + " + extSaque);
        });

    }

    @Override
    public void Deposito() {
        this.saldo = (getSaldo() + this.deposito);
        this.contagemDep = +1;

        //lista.add(getDeposito());
        for (int i = 0; i < this.contagemDep; i++) {
            Double usuario1 = getDeposito();
            listaD.add(usuario1);
        }

    }

    public void extratoDeposito() {
        System.out.println("Extrato dos depositos: ");
        listaD.forEach((extDeposito) -> {
            System.out.println(" - " + extDeposito);
        });

    }

    @Override
    public void transferencia() {
        if (getSaldo() > 0) {
            this.saldo = (this.getSaldo() - this.getTransferencia());
            System.out.println("Transferencia efetuada com sucesso! " + this.getTransferencia());
            this.contagemTrans++;
            this.transacoes = true;
        } else {
            System.out.println("Saldo insuficiente! ");
            this.getSaldo();
            this.transacoes = false;
        }

    }

    @Override
    public void informacoes() {
        System.out.println("Nº Agencia: " + this.getnAgencia());
        System.out.print("Nº Conta: " + this.getnConta());
        System.out.println(" Nº Ditito: " + this.getnDigito());
    }

    @Override
    public void tipoDeConta(String tipo) {

    }

    public void extrato() {

    }

}
