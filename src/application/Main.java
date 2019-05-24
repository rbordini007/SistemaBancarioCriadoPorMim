package application;

import enttities.CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rbord
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CC cc = new CC();

        System.out.println("----------- Tela de cadastro ------------");

        /*System.out.print("Nome: ");
        //sc.next();
        String nome = sc.nextLine();
        cc.setNome(nome);

        System.out.print("RG: ");
        int rg = sc.nextInt();
        cc.setRg(rg);

        System.out.print("Agencia: ");
        int agencia = sc.nextInt();
        cc.setnAgencia(agencia);

        System.out.print("Conta: ");
        int conta = sc.nextInt();
        cc.setnConta(conta);

        System.out.print("Digito: ");
        byte digito = sc.nextByte();
        cc.setnDigito(digito);*/
        System.out.print("Tipo de Conta (CC)ou cc: ");
        String tipo = sc.next();
        cc.tipoDeConta(tipo);
        System.out.println("---------------- INFORMAÇOES DA CONTA ---------------------");
        //cc.tipoDeConta(tipo);
        //System.out.println();
        // System.out.println("------------------------------------------------------------");
        System.out.println();
        cc.setSaldo(10000);
        cc.setDeposito(1000);
        cc.Deposito();
        cc.setDeposito(5000.50);
        cc.Deposito();
        cc.setDeposito(500.50);
        cc.Deposito();
        cc.setSaque(100.0);
        cc.saque();
        cc.setSaque(500);
        cc.saque();
        cc.setSaque(1500);
        cc.saque();
        cc.setSaque(20);
        cc.saque();
        cc.setTransferencia(350);
        cc.transferencia();
        cc.extrato();

        System.out.println("------------------------------------------------------");

        sc.close();

    }

}
