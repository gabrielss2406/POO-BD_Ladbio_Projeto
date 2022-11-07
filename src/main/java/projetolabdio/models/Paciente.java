/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.models;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Paciente {
    // ATRB
    private int idade;
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private int Medico_crm;
    //private Date data_nasc;

    // CONSTRUCTOR
    public Paciente(int idade, String cpf, String nome, String telefone, String endereco, int medico_crm/*, Date data_nasc*/) {
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.Medico_crm = medico_crm;
        /*this.data_nasc = data_nasc;*/
    }
    
    // GETTERS

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    public int getMedico_crm() {
        return Medico_crm;
    }
}
