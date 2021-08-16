/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohospital;

import java.util.Locale;
import java.util.ArrayList;

/**
 *
 * @author brend
 */
public class ProjetoHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        
        //Instanciando os clientes
        ArrayList<Cliente> clientes = new ArrayList();
        
        //Instanciando os funcionários
        Funcionario funcionario = new Funcionario("Tulio", "(38)99103-9305", "tulioalves@gmail.com", "Turmalina", 
         "11111111111", "Miopia", "Masculino");
        Enfermeiro enfermeiro = new Enfermeiro("Polesca", "(32)98447-5253", "matheuspolesca@gmail.com", "Sete Lagoas", 
         "22222222222", "Miopia", "Masculino");
        Medico medico = new Medico("Brenda", "(32)98447-5253", "brendaorlandi@gmail.com", "Diamantina", 
         "33333333333", "Miopia", "Feminino");
        
        //Adicionando os funcionários no array
        clientes.add(funcionario);
        clientes.add(enfermeiro);
        clientes.add(medico);
        
        Sistema.cadastrarCliente(funcionario, clientes);
        Sistema.analisePrevia(enfermeiro, clientes.get(3));
        Sistema.acessarInformações(medico, clientes);
    }
    
}
