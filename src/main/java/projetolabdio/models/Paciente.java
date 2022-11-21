package projetolabdio.models;

/**
 * Model of Paciente
 * @author Gabriel Siqueira
 * @since 10/11/22
 * @version 1.0
 */
public class Paciente {
    // ATRB
    private int idade;
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private int Medico_crm;

    /**
     * Constructor method from Paciente
     * @param idade Attribute phone of Paciente
     * @param cpf Primary key of Paciente
     * @param nome Attribute phone of Paciente
     * @param telefone Attribute phone of Paciente
     * @param endereco Attribute phone of Paciente
     * @param medico_crm Foreing key for Medico
     */
    public Paciente(String cpf, String nome, String endereco, String telefone, int idade, int medico_crm) { // CONSTRUCTOR
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.Medico_crm = medico_crm;
    }
    
    // GETTERS

    /**
     * Getter of idade
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Getter of cpf
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Getter of nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Getter of telefone
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Getter of endereco
     * @return endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Getter of Medico_crm
     * @return Medico_crm
     */
    public int getMedico_crm() {
        return Medico_crm;
    }
}
