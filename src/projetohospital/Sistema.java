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
abstract class Sistema {

    public Sistema() {
    }
    
    public void fazerLogin(){};
    public void alterarStatus(){};
    public void cadastrarCliente(){};
    public void iniciarAtendimento(){};
    public void encerrarAtendimento(){};
    public void gerarRelatorio(){};
    public void analizePrevia(){};
    public void acessarInformações(){};
    
}
