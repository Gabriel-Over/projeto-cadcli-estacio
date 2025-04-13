package com.mycompany.cadcli;

public class CadCli {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        
        cliente1.colocarCpf("14556898890");
        cliente1.colocarNome("Bruno");
        cliente1.colocarIdade(20);
        
        System.out.println(cliente1.descricao());
    }
}
