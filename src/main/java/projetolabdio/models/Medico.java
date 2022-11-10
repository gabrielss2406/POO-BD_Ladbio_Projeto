package projetolabdio.models;

/**
 * Model of Medico
 * @author Gabriel Siqueira
 * @since 10/11/22
 * @version 1.0
 */
public class Medico {
    // ATRB
    private int crm;
    private String nome;
    private String telefone;
    private String especialidade;
    private String senha;

    /**
     * Constructor method from Medico
     * @param crm Primary key of Medico
     * @param nome Attribute name of Medico
     * @param telefone Attribute phone of Medico
     * @param especialidade Attribute speciality of Medico
     * @param senha Attribute password of Medico
     */
    public Medico(int crm, String nome, String telefone, String especialidade, String senha) { //CONSTRUTOR
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    /**
     * Getter of crm
     * @return crm
     */
    public int getCrm() {
        return crm;
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
     * Getter of especialidade
     * @return especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * Getter of senha
     * @return senha
     */
    public String getSenha() {
        return senha;
    }
}
