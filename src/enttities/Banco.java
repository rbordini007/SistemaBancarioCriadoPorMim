package enttities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import services.InterfaceBanco;

public abstract class Banco implements InterfaceBanco {

    final SimpleDateFormat tempo = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
    final Calendar calend = Calendar.getInstance();

    protected int nAgencia;
    protected int nConta;
    protected int nDigito;
    protected double saldo;
    protected double saque;
    protected double deposito;
    protected double transferencia;
    protected String tipoConta;
    protected boolean transacoes;

    public Banco() {
    }

    public Banco(int nAgencia, int nConta, int nDigito) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.nDigito = nDigito;
        this.setDeposito(deposito);
        this.setSaque(saque);
        this.setTransferencia(transferencia);
        this.transacoes = false;
    }

    public int getnAgencia() {
        return nAgencia;
    }

    public void setnAgencia(int nAgencia) {
        this.nAgencia = nAgencia;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public int getnDigito() {
        return nDigito;
    }

    public void setnDigito(int nDigito) {
        this.nDigito = nDigito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

}
