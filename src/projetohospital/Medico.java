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
public class Medico extends Funcionario{

    public Medico() {
        super.setProfissao("Medico");
    }

    public Medico(String nome, String telefone, String email, String endereco, String cpf, String doencas, String sexo) {
        super(nome, telefone, email, endereco, cpf, doencas, sexo);
        super.setProfissao("Medico");
    }
    
    
}
