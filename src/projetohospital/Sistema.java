/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohospital;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author brend
 */
public abstract class Sistema{

    public Sistema() {
    }
    
    public static void fazerLogin(){
        System.out.println("Fazendo Login no Sistena.");
    }
    
    public static void alterarStatus(Funcionario f, Cliente c, String s){
        c.setStatus(s);
    }
    
    public static void cadastrarCliente(Funcionario f, ArrayList<Cliente> clientes){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do seu cliente?");
        String nome = sc.nextLine();
        System.out.println("Qual o telefone do seu cliente?");
        String telefone = sc.nextLine();
        System.out.println("Qual o email do seu cliente?");
        String email = sc.nextLine();
        System.out.println("Qual o endereço do seu cliente?");
        String endereco = sc.nextLine();
        System.out.println("Qual o cpf do seu cliente?");
        String cpf = sc.nextLine();
        System.out.println("Qual são as doenças?");
        String doenca = sc.nextLine();
        System.out.println("Qual o sexo do seu cliente?");
        String sexo = sc.nextLine();
        Cliente c = new Cliente(nome, telefone, email, endereco, cpf, doenca, sexo);
        c.setStatus("Aguardando Triagem");
        clientes.add(c);
    }
    
    public static void iniciarAtendimento(Funcionario f, Cliente c){
        alterarStatus(f, c, "Em atendimento");
    }
    
    public static void encerrarAtendimento(Funcionario f, Cliente c){
        alterarStatus(f, c, "Atendido");
    }
    
    public static void gerarRelatorio(Funcionario f, Cliente c){
    
    }
    
    public static void analisePrevia(Funcionario f, Cliente c){
        if(f.getProfissao()== "Enfermeiro"){
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual o novo estado do paciente?");
            String status = sc.nextLine();
            alterarStatus(f, c, status);
        }
        else
            System.out.println("Você não tem acesso a esse tipo de informação!!!");
    }
    
    public static void acessarInformações(Funcionario f, ArrayList<Cliente> clientes){
        if(f.getProfissao()== "Medico"){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual o nome do Cliente?");
            String nome = sc.nextLine();

            //Condição para pesquisar o nome
            for(int i=0; i<clientes.size(); i++){
                if(clientes.get(i).getNome() == null ? nome == null : clientes.get(i).getNome().equals(nome)){
                    System.out.println("DADOS DO CLIENTE" +
                            "\nSeu nome é: " + clientes.get(i).getNome() +
                            "\nSeu telefone é: " + clientes.get(i).getTelefone() +
                            "\nSeu e-mail: " + clientes.get(i).getEmail() +
                            "\nSeu endereço é: " + clientes.get(i).getEndereco() +
                            "\nSeu CPF é: " + clientes.get(i).getCpf()+
                            "\nSeu sexo é: " + clientes.get(i).getSexo() +
                            "\nSuas doenças são: " + clientes.get(i).getDoencas() +
                            "\nSeu estado atual é: " + clientes.get(i).getStatus() + "\n");
                    break;
                }
                else
                    System.out.println("Cleinte não encontrado.");
            }
        }
        else
            System.out.println("Você não tem acesso a esse tipo de informação!!!");
    }
    
    public static void gerarRelatorio(Funcionario f, ArrayList<Cliente> clientes){
         for(int i=0; i<clientes.size(); i++){
            System.out.println("DADOS DO CLIENTE" +
                "\nSeu nome é: " + clientes.get(i).getNome() +
                "\nSeu telefone é: " + clientes.get(i).getTelefone() +
                "\nSeu e-mail: " + clientes.get(i).getEmail() +
                "\nSeu endereço é: " + clientes.get(i).getEndereco() +
                "\nSeu CPF é: " + clientes.get(i).getCpf()+
                "\nSeu sexo é: " + clientes.get(i).getSexo() +
                "\nSuas doenças são: " + clientes.get(i).getDoencas() +
                "\nSeu estado atual é: " + clientes.get(i).getStatus() + "\n");
        }
    }
}
