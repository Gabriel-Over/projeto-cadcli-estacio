package com.mycompany.cadcli;

public class Cliente {
    private String cpf;
    private int idade;
    private String nome;
    
    //Valida se o CPF tiver somente numeros e se tiver 11 digitos
    public static boolean validarCpf(String cpf) {
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
        return "Nome do cliente: " + nome + ", CPF: " + cpf + ", Idade: " + idade;
    }
    
}
