/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohospital;

/**
 *
 * @author tulio
 */
public interface InterfaceSistema {
    
    public abstract void fazerLogin();
    public abstract void alterarStatus(Funcionario f, Cliente c, String s);
    public abstract void cadastrarCliente(Funcionario f, Cliente c);
    public abstract void iniciarAtendimento(Funcionario f, Cliente c);
    public abstract void encerrarAtendimento(Funcionario f, Cliente c);
    public abstract void gerarRelatorio(Funcionario f, Cliente c);
    public abstract void analisePrevia(Funcionario f, Cliente c);
    public abstract void acessarInformações(Funcionario f, Cliente c);
    
}
