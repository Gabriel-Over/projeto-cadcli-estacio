package com.mycompany.cadcli;

import java.util.Scanner;

public class CadCli {
    
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[100];
        Scanner minhaOpcao = new Scanner(System.in);
        char opcao;
        int i = 0;
        
        do {
            System.out.println("Cadastro de Clientes");
            System.out.println("(C)adastrar cliente");
            System.out.println("(L)istar clientes");
            System.out.println("(B)uscar clientes");
            System.out.println("(E)ditar cliente");
            System.out.println("(S)air");
            System.out.println("Opcao: ");
            opcao = minhaOpcao.next().charAt(0);

            switch(opcao) {
                case 'c':
                    cliente[i] = new Cliente();
                    cliente[i].cadastrarCliente();
                    i+=1;
                    break;
                case 'l':
                    System.out.println("Rotina nao implementada");
                    System.out.println("-----------------------------------");
                    break;
                case 'b':
                    System.out.println("Rotina nao implementada");
                    System.out.println("-----------------------------------");
                    break;
                case 'e':
                    System.out.println("Rotina nao implementada");
                    System.out.println("-----------------------------------");
                    break;
                case 's':
                    System.out.println("Rotina nao implementada");
                    System.out.println("-----------------------------------");
                    break;
                default:
                System.out.println("Opcao invalida!");
                System.out.println("-----------------------------------");
                break;
            }
            
        }while(opcao != 's');
        
        System.out.println("Fim do programa!");
    }
}
