package com.mycompany.cadcli;

public class Cliente {
    private String cpf;
    private int idade;
    private String nome;
    
    public void colocarCpf(String cpf) {
        
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
}
