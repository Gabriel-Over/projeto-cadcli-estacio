package com.mycompany.cadcli;

import java.util.Scanner;

public class Cliente {
    private String cpf;
    private int idade;
    private String nome;
    
    //Valida se o CPF tiver somente numeros e se tiver 11 digitos
    public boolean validarCpf(String cpf) {
        //Transforma a String em um array de caracteres para que a outra variavel possa percorrer
        for (char ch : cpf.toCharArray()) {
            if (!Character.isDigit(ch) || cpf.length() != 11) {
                return false;
            }
        }
        return true;
    }
    
    public void colocarCpf(String cpf) {
        if(validarCpf(cpf)) {
            this.cpf = cpf;
        }
    }
    
    public void colocarIdade(int idade){
        if (idade >= 0 && idade <= 100) {
            this.idade = idade;
        }
    }
    
    public void colocarNome(String nome) {
        if (nome.length() >= 2){ 
            this.nome = nome;
        }
    }
    
    //Construtor que cria um cliente sem dados
    public Cliente() {
        this.cpf = "";
        this.nome = "";
        this.idade = 0;
    }
    
    public String descricao() {
        return "Nome do cliente: " + nome + ",\nIdade: " + idade + ",\nCPF: " + cpf;
    }
   
    //tentei fazer um loop pra valiadar certinho mas ta dificil .-.
    public void cadastrarCliente() {
        Scanner atributo = new Scanner(System.in);
        Cliente ocliente = new Cliente();
        //GAMBIARRA DOIDA!!!!!!!!!!!!!!!
        do {
            System.out.println("Atribua um nome: ");
            nome = atributo.nextLine();
            ocliente.colocarNome(nome);

            System.out.println("Atribua uma Idade: ");
            idade = atributo.nextInt();
            ocliente.colocarIdade(idade);

            System.out.println("Atribua um CPF: ");
            String a = atributo.nextLine();
            cpf = atributo.nextLine();
            ocliente.colocarCpf(cpf);
            
        }while("".equals(ocliente.nome) || "".equals(ocliente.cpf) || ocliente.idade < 2);
        System.out.println("-----------------------------------");
        System.out.println(descricao());
    }
    
   public void listarClientes() {
       System.out.println(descricao());
   }
   
   public boolean buscarClientes(String busca) {
       return this.cpf.equals(busca);
   }
   
   //usar o buscarClientes
   public void editarClientes() {
       Scanner atributo = new Scanner(System.in);
       Cliente ocliente = new Cliente();
       do {
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Edite o nome: ");
            nome = atributo.nextLine();
            ocliente.colocarNome(nome);
            
            System.out.println("Idade do cliente: " + idade);
            System.out.println("Edite a Idade: ");
            idade = atributo.nextInt();
            ocliente.colocarIdade(idade);

            System.out.println("CPF do cliente: " + cpf);
            System.out.println("Edite o CPF: ");
            String a = atributo.nextLine();
            cpf = atributo.nextLine();
            ocliente.colocarCpf(cpf);
            
        }while("".equals(ocliente.nome) || "".equals(ocliente.cpf) || ocliente.idade < 2);
   }
}
