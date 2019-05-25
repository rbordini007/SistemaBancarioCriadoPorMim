package application;

import enttities.CC;
import enttities.CP;
import java.util.Locale;

import java.util.Scanner;

/**
 *
 * @author rbord
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char sair = 'n';

        while (sair == 'n') {
            System.out.println("---------- Sistema Bancario --------------");
            System.out.println("Olá, escolha a opção de conta");
            System.out.println("CONTA CORRENTE [cc] ou CONTA POUPANÇA [cp]");
            System.out.print("digite a opção: ");
            String tipCon = sc.next();
            if (("cc".equals(tipCon)) || ("CC".equals(tipCon))) {
                CC cc = new CC();
                cc.setTipoConta(tipCon);
                System.out.println("Cadatro da conta Corrente");
                System.out.println("Digite os dados");
                System.out.print("Nome: ");
                String nome = sc.next();
                cc.setNome(nome);
                System.out.print("RG: ");
                cc.setRg(sc.nextInt());
                System.out.print("N° Agência: ");
                cc.setnAgencia(sc.nextInt());
                System.out.print("Nº Conta: ");
                cc.setnConta(sc.nextInt());
                System.out.print("Nº Digito: ");
                cc.setnDigito(sc.nextByte());
                cc.limparSaida();

                System.out.println("Muito obrigado! Dados cadastrado com sucesso!");

                while (sair == 'n') {
                    int n;
                    char s = 's';
                    System.out.println("opções da conta ");
                    System.out.println("Deposito [1]");
                    System.out.println("Saque [2]");
                    System.out.println("Transferencia [3]");
                    System.out.println("Extrato completo [4]");
                    System.out.println("Extrato debitos [5]");
                    System.out.println("Extrato depositos [6]");
                    System.out.println("Sair [0]");
                    n = sc.nextByte();
                    cc.limparSaida();
                    if (n == 1) {
                        System.out.println("Olá " + cc.getNome());
                        System.out.print("digite o valor do deposito: ");
                        cc.setDeposito(sc.nextDouble());
                        System.out.println("-------------- Depositos --------------- ");
                        System.out.println();
                        cc.Deposito();
                    } else if (n == 2) {
                        System.out.println("Olá " + cc.getNome());
                        System.out.print("digite o valor do saque: ");
                        cc.setSaque(sc.nextDouble());
                        System.out.println("-------------- Saques --------------- ");
                        System.out.println();
                        cc.saque();
                    } else if (n == 3) {
                        System.out.println("Olá " + cc.getNome());
                        System.out.print("digite o valor da Transferencia: ");
                        cc.setTransferencia(sc.nextDouble());
                        System.out.println("-------------- Transferencias --------------- ");
                        cc.transferencia();
                    } else if (n == 4) {
                        cc.extrato();

                    } else if (n == 5) {
                        cc.extratoSaque();

                    } else if (n == 6) {
                        cc.extratoDeposito();
                    } else if (n == 0) {
                        sair = s;
                    }
                    System.out.println("----------------------------");

                }

            } else if (("cp".equals(tipCon)) || ("CP".equals(tipCon))) {
                CP cp = new CP();
                System.out.println("Cadastro da conta Poupança");
            }

            System.out.println("Deseja sair mesmo sair (s/n): ");
            sair = sc.next().charAt(0);

        }

        sc.close();

    }

}
