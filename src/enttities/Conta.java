package enttities;

import java.util.ArrayList;

public class Conta extends Banco {

    protected int contagemDep;
    protected int contagemSaque;
    protected int contagemTrans;

    //ArrayList<Double> lista = new ArrayList<>();
    ArrayList<Double> listaD = new ArrayList<>();
    ArrayList<Double> listaS = new ArrayList<>();
    ArrayList<Double> listaT = new ArrayList<>();

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
        //for (int i = 0; i < this.contagemSaque; i++) {
        Double usuario = getSaque();
        listaS.add(usuario);
        //}

    }

    public void extratoSaque() {
        //System.out.println("extrato saque: ");
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
        this.contagemDep = +1;
        //lista.add(getDeposito());
        Double usuario = getDeposito();
        listaD.add(usuario);

    }

    public void extratoDeposito() {
        //System.out.println("Extrato dos depositos: ");
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

            //this.contagemTrans++;
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
    public void tipoDeConta(String tipo) {

    }

    public void extrato() {

    }

}
