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
            opcao = Character.toLowerCase(opcao);

            switch(opcao) {
                //Cadastra clientes
                case 'c':
                    System.out.println("-----------------------------------");
                    cliente[i] = new Cliente();
                    cliente[i].cadastrarCliente();
                    i+=1;
                    System.out.println("-----------------------------------");
                    break;
                //Lista clientes
                case 'l':
                    System.out.println("-----------------------------------");
                    for (int j = 0; j < i; j++) {
                        System.out.print("->Cliente " + (j + 1) + ":\n");
                        cliente[j].listarClientes();
                    }
                    System.out.println("-----------------------------------");
                    break;
                //Busca clientes
                case 'b':
                    System.out.println("-----------------------------------");
                    
                    System.out.println("Busque um cliente pelo CPF: ");
                    //Insere o cpf
                    Scanner digitos = new Scanner(System.in);
                    String cpfBusca = digitos.nextLine();
                    
                    //Se for encontrado ele nao aparece a mensagem de "nao encontrado"
                    boolean encontrado = false;
                    
                    for (int j = 0; j < i; j++) {
                        if(cliente[j].buscarClientes(cpfBusca)){
                            System.out.println("-----------------------------------");
                            System.out.println("Dados:");
                            System.out.println(cliente[j].descricao());
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                            System.out.println("Cliente nao encontrado!");
                    }
                    
                    System.out.println("-----------------------------------");
                    break;
                //Edita clientes
                case 'e':
                    System.out.println("-----------------------------------");
                    
                    System.out.println("Edite um cliente buscando seu respectivo CPF: ");
                    //Insere o cpf
                    Scanner a = new Scanner(System.in);
                    cpfBusca = a.nextLine();
                    
                    //Se for encontrado ele nao aparece a mensagem de "nao encontrado"
                    encontrado = false;
                    
                    for (int j = 0; j < i; j++) {
                        if(cliente[j].buscarClientes(cpfBusca)){
                            System.out.println("-----------------------------------");
                            cliente[j].editarClientes();
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                            System.out.println("Cliente nao encontrado!");
                    }
                    System.out.println("-----------------------------------");
                    break;
                case 's':
                    System.out.println("-----------------------------------");
                    System.out.println("Saindo...");
                    System.out.println("-----------------------------------");
                    break;
                default:
                    System.out.println("-----------------------------------");
                    System.out.println("Opcao invalida!");
                    System.out.println("-----------------------------------");
                    break;
                }
            
            }while(opcao != 's');
        
        System.out.println("Fim do programa!");
    }
}
