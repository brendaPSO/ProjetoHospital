/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohospital;

/**
 *
 * @author brend
 */
public class Funcionario extends Cliente{
    private String profissao;

    public Funcionario() {
    }

    public Funcionario
        (String nome, String telefone, String email, String endereco, 
         String cpf, String doencas, char sexo) 
    {
        super(nome, telefone, email, endereco, cpf, doencas, sexo);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
}
